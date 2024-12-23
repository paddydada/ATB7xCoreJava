package LeetCode.string;

	import java.io.*;
	import java.util.*;
	import java.util.regex.*;

	public class duplicate {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = Integer.parseInt(scanner.nextLine()); // Read the number of sentences

	        for (int i = 0; i < n; i++) {
	            String input = scanner.nextLine();

	            // Regular expression to match repeated words (case insensitive)
	            String regex = "\\b(\\w+)(?i)\\s+\\1\\b";

	            // Use a HashSet to track already seen words in a case-insensitive manner
	            Set<String> seen = new HashSet<>();
	            StringBuilder output = new StringBuilder();
	            String[] words = input.split("\\s+"); // Split input into words

	            for (String word : words) {
	                String lowerCaseWord = word.toLowerCase();
	                if (!seen.contains(lowerCaseWord)) {
	                    seen.add(lowerCaseWord); // Mark the word as seen
	                    if (output.length() > 0) {
	                        output.append(" "); // Add space before the next word
	                    }
	                    output.append(word); // Add the original word
	                }
	            }

	            // Print the modified sentence
	            System.out.println(output.toString());
	        }

	        scanner.close(); // Close the scanner
	    }
	}
