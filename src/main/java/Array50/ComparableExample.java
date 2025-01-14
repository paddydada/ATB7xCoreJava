package Array50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>(
				Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"), new Student(2, "Charlie")));

		Collections.sort(students);

		System.out.println("Sorted by ID (default): " + students);

	}

}
