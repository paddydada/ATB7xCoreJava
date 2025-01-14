package ArrayProgram360;

public class SecondMax {

	// Find Second Smallest and Second Largest Element in an array
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 }; 

		// Edge case: If the array has fewer than two elements, handle it
		if (input.length < 2) {
			System.out.println("Array must have at least two elements.");
			return;
		}

		// Initialize variables
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		// Loop through the array
		for (int i = 0; i < input.length; i++) {
			// Update max and secondMax
			if (input[i] > max) {
				secondMax = max;
				max = input[i];
			} else if (input[i] > secondMax && input[i] != max) {
				secondMax = input[i];
			}

			// Update min and secondMin
			if (input[i] < min) {
				secondMin = min;
				min = input[i];
			} else if (input[i] < secondMin && input[i] != min) {
				secondMin = input[i];
			}
		}

		if (secondMax == Integer.MIN_VALUE || secondMin == Integer.MAX_VALUE) {
			System.out.println("Array does not have enough distinct elements.");
		} else {
			// Print results
			System.out.println("The largest element is " + max);
			System.out.println("The second largest element is " + secondMax);
			System.out.println("The smallest element is " + min);
			System.out.println("The second smallest element is " + secondMin);
		}
	}
}
