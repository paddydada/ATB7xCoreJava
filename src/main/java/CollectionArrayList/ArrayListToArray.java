package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "C++" };

		System.out.print("Array: ");

		// print array
		for (String str : arr) {
			System.out.print(str);
			System.out.print(" ");
		}

		// create an ArrayList from an array
		// add element using loop 
		ArrayList<String> list = new ArrayList<String>();

		for (String str : arr) {
			list.add(str);
		}

		System.out.println("\nArrayList: " + list);

		// 2 create an ArrayList from an array - Arrays.asList(arr) method
		
		ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
		System.out.println("\nArrayList: " + languages);
	}
}
