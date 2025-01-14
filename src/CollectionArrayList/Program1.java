package CollectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {

	// Reverse the elements of an ArrayList

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		System.out.println("Original ArrayList: " + list);

		// Reverse the ArrayList
		Collections.reverse(list);

		System.out.println("Reversed ArrayList: " + list);

	}

}
