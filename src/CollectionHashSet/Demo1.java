package CollectionHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		// Add elements
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");

		System.out.println("HashSet: " + set);

		HashSet<String> set2 = new HashSet<>(Arrays.asList("pineapple", "tommto"));

		// add using collection
		set.addAll(set2);

		// Check if an element exists
		System.out.println("Contains 'Banana'? " + set.contains("Banana"));

		// Remove an element
		set.remove("Grapes");
		System.out.println("After removing 'Grapes': " + set);

		// Check size
		System.out.println("Size: " + set.size());

		// iterate
		// Using for-each loop
		System.out.println("Using for-each loop:");
		for (String num : set) {
			System.out.println(num);
		}

		// Using Iterator
		System.out.println("Using Iterator:");
		Iterator<String> fruit = set.iterator();
		while (fruit.hasNext()) {
			System.out.println(fruit.next());
		}

		// Clear all elements
		set.clear();
		System.out.println("Is HashSet empty? " + set.isEmpty());

	}
}
