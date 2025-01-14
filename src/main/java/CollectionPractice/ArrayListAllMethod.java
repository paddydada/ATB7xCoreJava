package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAllMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// 1. Add elements to the list
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Grapes");

		// 2. Print the original list
		System.out.println("Original List: " + list);

		// 3. Add an element at a specific index
		list.add(2, "Pineapple");
		System.out.println("After adding Pineapple at index 2: " + list);

		// 4. Access elements using get() method
		System.out.println("Element at index 3: " + list.get(3)); // Should print Mango

		// 5. Find the index of an element
		System.out.println("Index of 'Mango': " + list.indexOf("Mango")); // Output: 4
		System.out.println("Index of 'Pineapple': " + list.indexOf("Pineapple")); // Output: 2

		// 6. Modify elements using set()

		list.set(1, "strawbery");
		System.out.println("After replacing Banana with Strawberry: " + list);

		// 7. Remove elements by index and by object
		list.remove(0); // Removes Apple
		list.remove("Mango"); // Removes Mango
		System.out.println("After removing Apple and Mango: " + list);

		// 8. Get size of the list
		System.out.println("Size of the list: " + list.size()); // Should print 4

		// 9. Check if the list is empty
		System.out.println("Is the list empty? " + list.isEmpty()); // Output: false

		// 10. Check if the list contains a specific element
		System.out.println("Does the list contain 'Grapes'? " + list.contains("Grapes")); // Output: true
		System.out.println("Does the list contain 'Pineapple'? " + list.contains("Pineapple")); // Output: true

		// 11. Find the last index of an element
		list.add("Banana");
		System.out.println("Last index of 'Banana': " + list.lastIndexOf("Banana")); // Output: 4

		// 12. Check if the list contains all elements from another collection
		ArrayList<String> anotherList = new ArrayList<>();
		anotherList.add("Strawberry");
		anotherList.add("Pineapple");
		System.out.println("Does the list contain all elements from another list? " + list.containsAll(anotherList)); // Output:
																														// true

		// 13. Remove all elements from the list that are in another collection
		list.removeAll(anotherList);
		System.out.println("After removing all elements from another list: " + list);

		// 14. Retain only the elements that are in another collection
		list.retainAll(anotherList);
		System.out.println("After retaining only elements from another list: " + list);

		// 15. Trim the capacity to the size of the list
		list.trimToSize();
		System.out.println("List after trimming capacity: " + list);

		// 16. Convert the list to an array
		String[] array = list.toArray(new String[0]);
		System.out.println("Array: ");
		for (String s : array) {
			System.out.println(s); // Will print elements in the list
		}

		// 17. Create a sublist from the original list
		List<String> sublist = list.subList(0, 1); // Gets elements from index 0 to 1 (exclusive)
		System.out.println("Sublist: " + sublist);

		// 18. Sort the list
		Collections.sort(list);
		System.out.println("Sorted List: " + list);

		// 19. Shuffle the list randomly
		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);

		// 20. Check if the list is empty after clearing all elements
		list.clear();
		System.out.println("List after clear: " + list); // Should print an empty list
		System.out.println("Is the list empty after clear? " + list.isEmpty()); // Output: true

	}

}
