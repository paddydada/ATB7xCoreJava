package setCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDiff {

	// Find the Difference Between Two Sets
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);

		System.out.println("Difference of set1 and set2: " + difference);

	}
}
