package ArrayProgram360;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig"));

		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Cherry", "Date", "Fig", "Grape", "Kiwi"));

		List<String> commonElements = new ArrayList<>(list1);

		commonElements.retainAll(list2);
		Collections.sort(commonElements);

		System.out.println(commonElements);
	}

}
