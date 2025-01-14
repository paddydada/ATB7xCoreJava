package Array50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(
				Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"), new Student(2, "Charlie")));

		// Custom comparator to sort by name
		Comparator<Student> sortByName = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name); // Sorting by Name
			}
		};

		// Sorting using Comparator
		Collections.sort(students, sortByName);

		System.out.println("Sorted by Name: " + students);
	}

}
