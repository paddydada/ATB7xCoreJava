package CollectionArrayList;

import java.util.ArrayList;

public class Program5 {

	// Convert ArrayList from given an array

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int num : input) {
			list.add(num);
		}

		System.out.println(list);

	}
}
