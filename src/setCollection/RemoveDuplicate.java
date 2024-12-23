package setCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	// Remove Duplicate Elements from a List Using Set

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 3, 5));

		Set<Integer> set = new HashSet<Integer>(list);

		// remove duplicate using convert to list to set

		System.out.println("original list" + list);
		System.out.println("List without duplicates: " + set);

	}

}
