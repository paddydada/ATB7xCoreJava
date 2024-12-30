package RahulShetty;

public class Capitaliletter {

	public static void main(String[] args) {

		String input = "Hello World! This Is A Sample String.";

		int l = input.length();
		int count = 0;

		// Create an array to store lowercase characters.
		char[] upperCase = new char[l];
		int index = 0;

		for (int i = 0; i < l; i++) {
			char c = input.charAt(i);

			if (Character.isUpperCase(c)) {
				count++;
				upperCase[index++] = c;
			}
		}

		System.out.println("Number of UpperCase letters: " + count);
		System.out.print("UpperCase letters: ");

		// Print the lowercase letters stored in the array
		for (int i = 0; i < index; i++) {
			System.out.print(upperCase[i] + " ");
		}
	}
}
