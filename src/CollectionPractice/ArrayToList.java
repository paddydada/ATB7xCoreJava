package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayToList {
	public static void main(String[] args) {
		String[] array = { "Apple", "Banana", "Orange" };
		ArrayList<String> list = new ArrayList<String>();
		for (String string : array) {
			list.add(string);
		}

		System.out.println("Modified Array: " + list.toString()); // Array also reflects the change

	}

}
