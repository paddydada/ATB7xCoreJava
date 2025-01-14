package CollectionLinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);

		System.out.println("Original LinkedList: " + list);

		HashSet<Integer> set = new HashSet<>();
		LinkedList<Integer> result = new LinkedList<>();

		for (Integer element : list) {
			if (!set.contains(element)) {
				set.add(element);
				result.add(element);
			}
		}

		System.out.println("LinkedList after removing duplicates: " + result);
	}
}
