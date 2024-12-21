package RahulShetty;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrences {

	public static void main(String[] args) {
		// Example string
		String input = "I am Pravin Kadam";

		// Get the character count map
		Map<Character, Integer> characterCountMap = countCharacterOccurrences(input);

		// Print the character counts
		System.out.println("Character counts in the string:");
		for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
			System.out.print(entry.getKey() + ": " + entry.getValue() + "    ");
		}
	}

	// Method to count occurrences of each character in a string
	public static Map<Character, Integer> countCharacterOccurrences(String str) {
		Map<Character, Integer> countMap = new HashMap<>();

		// Iterate through each character in the string
		for (char c : str.toCharArray()) {
			// Update the count of the character in the map
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}

		return countMap;
	}
}
