package CollectionLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		LinkedList<Integer> reversedList = new LinkedList<>();
		while (!list.isEmpty()) {
			reversedList.addFirst(list.poll());
		}

		System.out.println("Reversed LinkedList: " + reversedList);

	}

}
