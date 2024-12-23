package setCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// Step 1: Create a Set and add initial elements

		// Set<Integer> set = new HashSet<Integer>();

		Set<Integer> set = new LinkedHashSet<Integer>();

		// Add method - adding initial elements
		set.add(11);
		set.add(12);
		set.add(13);

		// Display original set
		System.out.println("Initial Set: " + set);

		// Step 2: Create an ArrayList for additional elements
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(14);
		arr.add(15);
		arr.add(16);
		arr.add(17);

		// Add all elements from the ArrayList to the Set
		set.addAll(arr);

		// Display the set after adding all elements
		System.out.println("Set after addAll(): " + set);

		// Step 3: Display the size of the set
		System.out.println("Size of the Set: " + set.size());

		// Step 4: Remove an element from the set
		set.remove(17);
		System.out.println("Set after removing element 17: " + set);

		// Optional: Show added elements separately
		System.out.println("Original Elements: [11, 12, 13]");
		System.out.println("Added Elements from ArrayList: " + arr);

		// remove all
		set.removeAll(Arrays.asList(15));
		System.out.println("Set after removeAll: " + set);

		// contains and containsAll - boolean

		System.out.println(set.contains(11)); // true
		System.out.println(set.containsAll(Arrays.asList(11, 17))); // false
		System.out.println(set.containsAll(Arrays.asList(11, 12, 13, 14))); // true

		// Check if the set is empty
		System.out.println("Is the set empty? " + set.isEmpty());

		// System.out.println(set.toArray());
		Object[] array = set.toArray();
		System.out.println("Set converted to Array: " + Arrays.toString(array));

		// iterator
		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// for

		for (int a : set) {
			System.out.println(a);
		}
	}
}
