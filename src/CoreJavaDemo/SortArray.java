package CoreJavaDemo;

public class SortArray {

	public static void main(String[] args) {
		// Input array
		int[] input = { 2, 6, 1, 7, 9 };

		// Bubble sort algorithm
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					// Swap input[j] and input[j + 1]
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		// Print the sorted array
		System.out.println("Sorted array:");
		for (int value : input) {
			System.out.println(value);
		}
	}
}
