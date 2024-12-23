package CoreJavaDemo;

public class TablPrint {

	public static void main(String[] args) {

		// Loop to iterate over numbers 1 to 10 (for table rows)
		for (int i = 1; i <= 10; i++) {

			// Loop to print multiples of 'i'
			for (int j = 1; j <= 10; j++) {
				// Print the product of i and j, followed by a tab
				System.out.print(i * j + "\t");
			}

			// Move to the next line after each row is printed
			System.out.println();
		}
	}
}
