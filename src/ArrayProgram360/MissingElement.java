package ArrayProgram360;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {

        // Find missing number in an array
        int[] arr = {1, 2, 4, 5, 6}; // Input array with missing number 3

        // Sort the array (optional for a non-sorted input)
        Arrays.sort(arr);

        int missingNumber = findMissingNumber(arr);

        System.out.println("The missing number is: " + missingNumber);
    }

    private static int findMissingNumber(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];

        for (int i = min; i <= max; i++) { 
            boolean found = false;
            for (int num : arr) { 
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) { 
                return i;
            }
        }

        // If no missing number found, return -1 (this shouldn't happen for a valid input)
        return -1;
    }
}
