package coreJava;

public class MinNumMatrix {

    public static void main(String[] args) {
        // Define the 2D array
        int abc[][] = { 
            { 2, 4, 5 }, 
            { 3, 2, 10 }, 
            { 1, 2, 0 } 
        };

        // Initialize variables to track the minimum value and its column index
        int min = abc[0][0];
        int minColumn = 0;

        // Find the minimum value in the matrix and its column index
        for (int i = 0; i < 3; i++) { // Iterate over rows
            for (int j = 0; j < 3; j++) { // Iterate over columns
                if (abc[i][j] < min) { 
                    min = abc[i][j];
                    minColumn = j; // Update column index of the minimum value
                }
            }
        }

        // Now find the maximum value in the column where the minimum value was found
        int max = abc[0][minColumn];
        for (int k = 1; k < 3; k++) { // Iterate over rows in the minColumn
            if (abc[k][minColumn] > max) {
                max = abc[k][minColumn];
            }
        }

        // Output both the minimum and maximum values
        System.out.println("Minimum value in the matrix: " + min);
        System.out.println("Maximum value in the column of the minimum value: " + max);
    }
}
