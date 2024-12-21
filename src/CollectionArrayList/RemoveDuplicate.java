package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		// Write a program to remove duplicate elements from an ArrayList.

		// inout {1, 2, 2, 3, 4, 4, 5}
		
		//[1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

		// convert to set

		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

		list.clear();
		list.addAll(set);

		System.out.println("After removing duplicates: " + list);

	}

}
