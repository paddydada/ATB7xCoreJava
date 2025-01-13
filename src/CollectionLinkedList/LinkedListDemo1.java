package CollectionLinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {

		// 1. Creating a LinkedList
		LinkedList<String> linkedList = new LinkedList<>();

		// 2. Adding elements to the LinkedList
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");

		// 3. Adding an element to the first position
		linkedList.addFirst("Grapes");

		// 4. Adding an element to the last position (same as add)
		linkedList.addLast("Mango");

		// 5. Display the current list
		System.out.println("Linked List: " + linkedList);

		// 6. Get the first element
		System.out.println("First element: " + linkedList.getFirst());

		// 7. Get the last element
		System.out.println("Last element: " + linkedList.getLast());

		// 8. Accessing element at a specific index
		System.out.println("Element at index 2: " + linkedList.get(2));

		// 9. Check if an element exists
		System.out.println("Contains 'Banana': " + linkedList.contains("Banana"));
		System.out.println("Contains 'Pineapple': " + linkedList.contains("Pineapple"));

		// 10. Remove the first element
		linkedList.removeFirst();
		System.out.println("After removing the first element: " + linkedList);

		// 11. Remove the last element
		linkedList.removeLast();
		System.out.println("After removing the last element: " + linkedList);

		// 12. Remove a specific element
		linkedList.remove("Orange");
		System.out.println("After removing 'Orange': " + linkedList);

		// 13. Get the size of the list
		System.out.println("Size of the list: " + linkedList.size());

		// 14. Check if the list is empty
		System.out.println("Is the list empty? " + linkedList.isEmpty());

		// 15. Add elements at the end using offer (similar to add)
		linkedList.offer("Pineapple");
		System.out.println("After using offer: " + linkedList);

		// 16. Poll (removes and returns the first element)
		System.out.println("Polled element: " + linkedList.poll());
		System.out.println("After poll: " + linkedList);

		// 17. Peek (retrieves but does not remove the first element)
		System.out.println("Peeked element: " + linkedList.peek());
		System.out.println("After peek: " + linkedList);

		// 18. Clear the entire list
		linkedList.clear();
		System.out.println("After clearing the list: " + linkedList);
	}
}
