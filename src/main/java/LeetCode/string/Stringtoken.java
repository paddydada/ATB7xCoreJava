package LeetCode.string;

import java.util.Scanner;

public class Stringtoken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		// Read the input line
		String input = scanner.nextLine();

		// Use regex to split the input string into tokens based on non-letter
		// characters
		String[] tokens = input.split("[^A-Za-z]+");

		// Filter out any empty tokens and count valid tokens
		int tokenCount = 0;
		for (String token : tokens) {
			if (!token.isEmpty()) {
				tokenCount++;
			}
		}

		// Print the number of tokens
		System.out.println(tokenCount);

		// Print each token on a new line
		for (String token : tokens) {
			if (!token.isEmpty()) {
				System.out.println(token);
			}
		}

		scanner.close();
	}
}
