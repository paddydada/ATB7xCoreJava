package ArrayProgram360;

public class NumdigitSperate {
	public static void main(String[] args) {
		String abc = "am2ar 13!@#";

		// To collect letters, numbers, and special characters
		StringBuilder letters = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder specialCharacters = new StringBuilder();

		for (int i = 0; i < abc.length(); i++) {
			char ch = abc.charAt(i);

			// Check if character is a letter, digit, or special character
			if (Character.isLetter(ch)) {
				letters.append(ch);
			} else if (Character.isDigit(ch)) {
				numbers.append(ch);
			} else if (!Character.isWhitespace(ch)) { // Check for special characters
				specialCharacters.append(ch);
			}
		}

		// Print the collected letters, numbers, and special characters
		System.out.println("Letters: " + letters);
		System.out.println("Numbers: " + numbers);
		System.out.println("Special Characters: " + specialCharacters);
	}
}
