package CollectionArrayList;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		// Write a Java program to remove all occurrences of a specific element from an
		// ArrayList.

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Cherry");

		System.out.println(list.toString());

		// Remove all occurrences of "Apple"
		list.removeIf(item -> item.equals("Apple"));

		System.out.println("ArrayList after removal: " + list);

	}

}
