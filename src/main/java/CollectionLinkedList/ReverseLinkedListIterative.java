package CollectionLinkedList;

import java.util.LinkedList;

public class ReverseLinkedListIterative {
	public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
		LinkedList<Integer> reversedList = new LinkedList<>();
		while (!list.isEmpty()) {
			reversedList.addFirst(list.poll());
		}
		return reversedList;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println("Original LinkedList: " + list);
		LinkedList<Integer> reversedList = reverse(list);
		System.out.println("Reversed LinkedList: " + reversedList);
	}
}
