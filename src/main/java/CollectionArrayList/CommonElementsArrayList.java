package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

		// Find common elements
		list1.retainAll(list2);

		System.out.println("Common elements: " + list1);
	}
}
