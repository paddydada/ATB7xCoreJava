package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program4 {

	// Find the largest and smallest elements in an ArrayList of numbers
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 12, 14, 19, 13, 20, 9, 7));

		// Sort the ArrayList in ascending order
		Collections.sort(list);

		// Smallest element (first element after sorting)
		System.out.println("Smallest element: " + list.get(0));

		// Largest element (last element after sorting)
		System.out.println("Largest element: " + list.get(list.size() - 1));
	}
}
