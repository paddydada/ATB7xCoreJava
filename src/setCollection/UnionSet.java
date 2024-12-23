package setCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		Set<Integer> union = new HashSet<>(set1);

		union.addAll(set2);

		System.out.println("Union of two sets: " + union);

	}
}
