package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateWordsFromSentence {
	public static void main(String[] args) {
		String str = "I am Pravin Kadam .I am learning Java ";
		printSentenceWithoutDuplicates(str);
	}
	private static void printSentenceWithoutDuplicates(String str) {
		// Split the string into words
		String[] strSplit = str.split("\\s+");
		// Use a LinkedHashSet to preserve the order and remove duplicates
		Set<String> uniqueWords = new LinkedHashSet<>();
		for (String word : strSplit) {
			uniqueWords.add(word);
		}
		// Join the words back into a sentence
		String result = String.join(" ", uniqueWords);
		// Print the result
		System.out.println(result);
	}
}


//I am Pravin Kadam .I learning Java