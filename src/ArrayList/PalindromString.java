package ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromString {

	// Helper method to check if a word is a palindrome
	public static boolean isPalindrome(String word) {
		String reversed = new StringBuilder(word).reverse().toString();
		return word.equalsIgnoreCase(reversed);
	}

	public static void main(String[] args) {

		List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");

		// Use the stream to filter palindromic words
		List<String> palindromicWordsList = words.stream().filter(PalindromString::isPalindrome)
				.collect(Collectors.toList());

		// Print the list of palindromic words
		System.out.println("Palindromic Words: " + palindromicWordsList);
	}
}
