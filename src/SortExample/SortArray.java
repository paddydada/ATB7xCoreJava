package SortExample;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        for (int i = 0; i < array.length - 1; i++) { // Outer loop
            for (int j = 0; j < array.length - i - 1; j++) { // Inner loop
                if (array[j] > array[j + 1]) { // Swap if needed
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            // Print the array after each pass
            System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(array));
        }

        // Final sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
