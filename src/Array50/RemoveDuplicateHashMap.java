package Array50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateHashMap {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 2, 4, 2, 6, 8, 9, 7, 1));

		HashSet<Integer> set = new HashSet<Integer>(list);

		ArrayList<Integer> uniqueList = new ArrayList<>(set);

		System.out.println("Original List: " + list);
		System.out.println("List after removing duplicates: " + uniqueList);

	}
}
