package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("word", "java", "python", "selenium"));
		System.out.println(list.size());

		// convert list to array
		String[] array = list.toArray(new String[0]);
		System.out.println("array");
		for (String s : array) {
			System.out.println(s);
		}
	}

}
