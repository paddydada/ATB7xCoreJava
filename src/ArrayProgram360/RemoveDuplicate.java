package ArrayProgram360;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void removeDuplicates(int a[], int n) {
		Set<Integer> hash_set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			hash_set.add(a[i]);
		}
		System.out.print(hash_set);

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 3, 4, 5, 6, 4, 4, 5, 5 };
		int b[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

		int n = a.length;
		removeDuplicates(a, n);
		removeDuplicates(b, b.length);
	}
}

//[1, 2, 3, 4, 5, 6]
//[1, 3, 4, 5, 22, 6, 9, 10]