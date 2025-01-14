package CollectionArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Program2 {

	//2 Find the duplicate elements in an ArrayList
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Cherry");
		list.add("Banana");

		HashSet<String> set = new HashSet<String>();
		for (String item : set) {
			if (!set.add(item)) {
				System.out.println("Duplicate element: " + item);
			}
		}
	}

}
