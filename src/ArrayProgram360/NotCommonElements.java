package ArrayProgram360;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotCommonElements {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Cherry", "Date", "Fig", "Grape", "Kiwi"));

		List<String> uniqueToList1 = new ArrayList<>(list1);
		List<String> uniqueToList2 = new ArrayList<>(list2);

		uniqueToList1.removeAll(list2); // Elements in list1 but not in list2
		uniqueToList2.removeAll(list1); // Elements in list2 but not in list1

		// Combine the unique elements
		List<String> notCommonElements = new ArrayList<>();
		notCommonElements.addAll(uniqueToList1);
		notCommonElements.addAll(uniqueToList2);

		// Display the result
		System.out.println("Not Common Elements: " + notCommonElements);

	}

}
