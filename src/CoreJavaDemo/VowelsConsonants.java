package CoreJavaDemo;

public class VowelsConsonants {

	public static void main(String[] args) {
		// Input string
		String input = "pravin";
		int vowelCount = 0;
		int consonantCount = 0;

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				// Check if the character is a vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
					System.out.println(ch + " is a vowel. Total vowels: " + vowelCount);
				} else {
					consonantCount++;
					System.out.println(ch + " is a consonant. Total consonants: " + consonantCount);
				}
			}
		}

		System.out.println("Total vowels: " + vowelCount);
		System.out.println("Total consonants: " + consonantCount);
	}
}
