package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Pravin", "Amar", "Dipak", "Nayan"));

		System.out.println("Before Reversed list: " + list);
		Collections.reverse(list);

		System.out.println("Reversed list: " + list);

		// sort

		Collections.sort(list);

		System.out.println("sorted list: " + list);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println("reverseOrder sorted list: " + list);

	}

}
