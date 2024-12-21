package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();

		// Add elements
		languages.add("Java");
		languages.add("PHP");
		languages.add("#net");
		// duplicate allow
//		languages.add("Java");
//		languages.add("PHP");
//		languages.add("#net");

		System.out.println("ArrayList: " + languages);

		// Add an element at a specific index
		languages.add(1, "Python");
		System.out.println("After adding 'Python' at index 1: " + languages);

		// Access elements
		System.out.println("Element at index 2: " + languages.get(2));

		// Change the element of the ArrayList
		languages.set(2, "JavaScript");
		System.out.println("Modified ArrayList: " + languages);

		// Remove element from index 2
		String str = languages.remove(2);
		System.out.println("Updated ArrayList: " + languages);
		System.out.println("Removed Element: " + str);

		// Check if the ArrayList contains a specific element
		boolean hasJava = languages.contains("Java");
		System.out.println("Does the ArrayList contain 'Java'? " + hasJava);

		// Check the size of the ArrayList
		System.out.println("Size of ArrayList: " + languages.size());

		// Check if the ArrayList is empty
		boolean isEmpty = languages.isEmpty();
		System.out.println("Is the ArrayList empty? " + isEmpty);

		// Unsorted ArrayList
		System.out.println("Unsorted ArrayList: " + languages);

		// Sort the ArrayList in ascending order
		languages.sort(Comparator.naturalOrder());
		System.out.println("Sorted ArrayList: " + languages);

		// Iterate through the ArrayList using a for-each loop
		System.out.println("Iterating through the ArrayList:");
		for (String language : languages) {
			System.out.println(language);
		}

		// Clear the ArrayList
		languages.clear();
		System.out.println("ArrayList after clear(): " + languages);

		// Check if the ArrayList is empty after clearing
		System.out.println("Is the ArrayList empty now? " + languages.isEmpty());
	}
}
