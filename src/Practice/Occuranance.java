package Practice;

import java.util.HashMap;
import java.util.Iterator;

public class Occuranance {
	public static void main(String[] args) {

		// Write a Java Program to count the number of characters in a given String.

		String name = "Pravin adkadam";

		HashMap<Character, Integer> charCount = new HashMap<>();

		for (int i = 0; i < name.length() - 1; i++) {

			char currentChar = name.charAt(i);

			charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
		}

		System.out.print(charCount);

	}

}
