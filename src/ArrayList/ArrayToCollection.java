package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		String students[] = { "Kamlesh", "Abhay", "Abhishek", "Shivansh" };

		System.out.println("Array input: " + Arrays.toString(students));

		// Option 1: Using ArrayList constructor with Arrays.asList()  best solution
		ArrayList<String> studentList = new ArrayList<>(Arrays.asList(students));
		System.out.println("Converted elements using ArrayList: " + studentList);

		// Option 2: Using List interface reference
		List<String> studentList2 = Arrays.asList(students); // This creates a fixed-size list
		System.out.println("Converted elements using List: " + studentList2);
	}
}


//Resizable: You can add, remove, or modify elements freely in the resulting ArrayList. It's a standard implementation of a mutable, resizable collection.
//Example: studentList.add("New Student"); works without issues.
//Preferred for Dynamic Operations: If you plan to perform dynamic operations like resizing, sorting, or filtering, this approach is better.
//Independent Copy: The resulting ArrayList is independent of the original array. Changes to the list will not affect the array and vice versa.