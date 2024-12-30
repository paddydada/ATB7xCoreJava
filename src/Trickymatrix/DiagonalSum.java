package Trickymatrix;

public class DiagonalSum {

	public static void main(String[] args) {
		// Example square matrix
		int[][] matrix = { 
							{ 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 }
						};

		// Calculate and print diagonal sums
		int primarySum = calculatePrimaryDiagonalSum(matrix);
		int secondarySum = calculateSecondaryDiagonalSum(matrix);

		System.out.println("Primary Diagonal Sum: " + primarySum);
		System.out.println("Secondary Diagonal Sum: " + secondarySum);
	}

	// Method to calculate the primary diagonal sum
	public static int calculatePrimaryDiagonalSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i]; // Primary diagonal elements: matrix[i][i]
		}
		return sum;
	}

	// Method to calculate the secondary diagonal sum
	public static int calculateSecondaryDiagonalSum(int[][] matrix) {
		int sum = 0;
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			sum += matrix[i][n - i - 1]; // Secondary diagonal: matrix[i][n-i-1]
		}
		return sum;
	}
}
