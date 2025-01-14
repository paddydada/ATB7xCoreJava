package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		// iterate using loop

		System.out.println("Using for-each loop:");
		for (String s : list) {
			System.out.print(s + " ");
		}

		// using iterator

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		// using foreach

		list.forEach(element -> System.out.print(element + " "));

	}

}
