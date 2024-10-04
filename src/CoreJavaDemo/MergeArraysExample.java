package CoreJavaDemo;

import java.util.Arrays;

public class MergeArraysExample {

    public static void main(String[] args) {
        // Initialize two integer arrays
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        
        // Approach 1 - Using System.arraycopy() to merge two arrays
        // Create a new array that will hold elements from both array1 and array2
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array into mergedArray starting at index 0
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from the second array into mergedArray starting at array1's length
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Print the merged array from the first approach
        System.out.print("Merged Array using System.arraycopy(): ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();  // Line break after first array merge output

        // Approach 2 - Using Java Streams (Java 8+ feature) to merge arrays
        // Merge the two arrays using streams and flatMap to handle multiple arrays
        int[] mergedArray1 = Arrays.stream(new int[][] { array1, array2 })
                                   .flatMapToInt(Arrays::stream)
                                   .toArray();

        // Print the merged array from the second approach
        System.out.print("Merged Array using Java Streams: ");
        for (int num : mergedArray1) {
            System.out.print(num + " ");
        }
    }
}
