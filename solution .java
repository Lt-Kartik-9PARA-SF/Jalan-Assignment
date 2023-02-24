import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 11, 7};
        int[] shuffled = shuffle(arr);
        System.out.println(Arrays.toString(shuffled)); // [1, 11, 2, 7, 3, 5]
    }

    public static int[] shuffle(int[] arr) {
        // sort the input array in ascending order
        Arrays.sort(arr);

        // create a new array to hold the shuffled elements
        int[] shuffled = new int[arr.length];

        // keep track of the highest and lowest remaining elements
        int i = 0;
        int j = arr.length - 1;

        // alternate between taking the lowest remaining element and the highest remaining element
        for (int k = 0; k < arr.length; k++) {
            if (i == j) {
                // if there is only one element remaining, add it to the shuffled array
                shuffled[k] = arr[i];
            } else {
                // add the lowest remaining element
                shuffled[k] = arr[i++];
                // add the highest remaining element
                shuffled[k + 1] = arr[j--];
                k++;
            }
        }

        return shuffled;
    }
}
// time complexity would be O(n log n) beacause we are sorting the array
// space complexity would be O(N) because we are using an Array to inside the function to store values .
