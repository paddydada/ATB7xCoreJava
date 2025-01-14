package CoreJavaDemo;

import java.util.HashMap;
import java.util.Scanner;

public class CountVowelsChar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String input = scanner.next().toLowerCase(); 
		int vowelCount = 0, consonantCount = 0;

		HashMap<Character, Integer> vowelMap = new HashMap<>();
		HashMap<Character, Integer> consonantMap = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
				vowelMap.put(ch, vowelMap.getOrDefault(ch, 0) + 1);
			} else if (ch >= 'a' && ch <= 'z') { // Checking if it's a consonant
				consonantCount++;
				consonantMap.put(ch, consonantMap.getOrDefault(ch, 0) + 1);
			}
		}

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);

		// Print the frequency of each vowel
		System.out.println("Vowel occurrences:");
		for (char vowel : vowelMap.keySet()) {
			System.out.println(vowel + " occurs " + vowelMap.get(vowel) + " time(s)");
		}

		// Print the frequency of each consonant
		System.out.println("Consonant occurrences:");
		for (char consonant : consonantMap.keySet()) {
			System.out.println(consonant + " occurs " + consonantMap.get(consonant) + " time(s)");
		}

		// Closing scanner
		scanner.close();
	}

}
