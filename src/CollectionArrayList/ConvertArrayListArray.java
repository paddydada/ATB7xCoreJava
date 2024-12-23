package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

		String[] array = list.toArray(new String[0]);

		System.out.println("Array: " + Arrays.toString(array));

		// Array to ArrayList
		List<String> newList = Arrays.asList(array);

		System.out.println("ArrayList: " + newList);

	}

}
