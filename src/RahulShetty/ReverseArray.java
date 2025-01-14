package RahulShetty;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        // Example array to reverse
        int[] array = {1, 2, 3, 4, 5};

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start to end
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}
