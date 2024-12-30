package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSingleLine {

	public static void main(String[] args) {

//		How to create and initialize an ArrayList in a single line?

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Pravin", "navin", "vipul"));

		System.out.println("create and initialize an ArrayList in a single line" + list);

		//// convert ArrayList into a String
		String str = list.toString();
		System.out.println("String: " + list);
	}

}
