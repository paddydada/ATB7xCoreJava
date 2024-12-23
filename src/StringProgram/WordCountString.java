package StringProgram;

import java.util.HashMap;

public class WordCountString {

	public void duplicate(String inputString) {
		// Convert input string to lowercase and split it into words
		String[] words = inputString.toLowerCase().split(" ");

		// Create HashMap to store word counts
		HashMap<String, Integer> wordcount = new HashMap<>();

		// Iterate over each word
		for (String word : words) {
			// Increment the count for the word in the map
			wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
		}

		// Print the word counts
		System.out.println("Word counts:");
		

		for (HashMap.Entry<String, Integer> entry : wordcount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// Create an instance of the class
		WordCountString wordCounter = new WordCountString();

		// Test input
		String inputString = "This is a test This is only a test";

		wordCounter.duplicate("Bread butter and bread");

		wordCounter.duplicate("Java is java again java");

		wordCounter.duplicate("Super Man Bat Man Spider Man");

		// Call the duplicate method
		wordCounter.duplicate(inputString);
	}
}


//Word counts:
//bread: 2
//butter: 1
//and: 1
