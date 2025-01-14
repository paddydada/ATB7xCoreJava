package setCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargetElement {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(3, 5, 7, 2, 8, 1));

		int largest = Collections.max(set);

		System.out.println(largest);

		int lowest = Collections.min(set);
		System.out.println(lowest);

		// Convert set to list
		List<Integer> list = new ArrayList<>(set);

		System.out.println("Converted List: " + list);

	}
}
