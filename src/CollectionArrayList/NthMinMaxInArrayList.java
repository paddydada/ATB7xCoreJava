package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMinMaxInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 15, 25));

		// Sort the ArrayList
		Collections.sort(list); // Sorting in ascending order

		int n = 2; // Change this value to find nth min or max

		if (n <= list.size()) {
			int nthMin = list.get(n - 1); // nth minimum
			int nthMax = list.get(list.size() - n); // nth maximum

			System.out.println("Sorted List: " + list);
			System.out.println(n + "th Minimum: " + nthMin);
			System.out.println(n + "th Maximum: " + nthMax);
		} else {
			System.out.println("Invalid value of n. It should be <= " + list.size());
		}
	}
}
