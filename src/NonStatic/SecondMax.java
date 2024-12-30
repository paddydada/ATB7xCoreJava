package NonStatic;

public class SecondMax {

	public static void main(String[] args) {
		int[] input = { 20, 40,60, 10, 89, 50 };

		// Initialize max and secondMax
		int max = input[0];
		int secondMax = input[0];

		// Loop through the array
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				secondMax = max; // Update secondMax before updating max
				max = input[i]; // Update max
			} else if (secondMax < input[i]) {
				secondMax = input[i];
			}
		}

		// Check if secondMax was updated
		if (secondMax != max) {
			System.out.println("The second maximum value is: " + secondMax);
		} else {
			System.out.println("There is no second maximum value.");
		}
	}
}
