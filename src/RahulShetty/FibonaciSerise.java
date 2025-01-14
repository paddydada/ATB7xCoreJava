package RahulShetty;

public class FibonaciSerise {

	public static void main(String[] args) {

		int n = 10; // Number of terms in the Fibonacci series
		int n1 = 0, n2 = 1; // Initialize the first two terms of the series

		System.out.print("Fibonacci Series till " + n + " terms: ");

		// Loop to print each term in the Fibonacci series
		for (int i = 1; i <= n; ++i) {
			// Print the current term
			System.out.print(n1);

			// Compute the next term
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			// Print a comma and space if it's not the last term
			if (i < n) {
				System.out.print(", ");
			}
		}

		// Move to the next line after printing the series
		System.out.println();
	}
}
