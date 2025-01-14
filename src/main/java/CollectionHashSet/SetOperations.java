package CollectionHashSet;

import java.util.HashSet;

public class SetOperations {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		// union
		HashSet<Integer> union = new HashSet<>(set1);

		union.addAll(set2);
		System.out.println("Union: " + union);
		// Union: [1, 2, 3, 4, 5]

		// Difference
		HashSet<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference: " + difference);

		// Intersection
		HashSet<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: " + intersection);

	}

}
