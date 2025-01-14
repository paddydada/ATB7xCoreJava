package CollectionArrayList;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();

		// Add elements to ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		System.out.println("ArrayList: " + languages);

		// Add elements

		// Access elements get method
		String name = languages.get(2);
		System.out.println(name);

		// Change elements

		languages.set(2, "cucumber");
		String name1 = languages.get(2);
		System.out.println(name1);

		// Remove elements

		languages.remove(2);

		// size
		System.out.println(languages.size());

		languages.add("java");
		languages.add("php");
		languages.add("javascriptn");
		languages.add("golang");

		// Iterate through an ArrayList

		for (String abc : languages) {

			System.out.println(abc);

		}

		// create a new array of String type
		String[] arr = new String[languages.size()];
		System.out.println(arr.length);

		System.out.println("ArrayList: " + languages);

		// convert ArrayList into an array
		languages.toArray(arr);

		System.out.print("Array: ");

		// access elements of the array
		for (String item : arr) {
			System.out.print(item + ", ");
		}
		
		
		
		

	}

}
