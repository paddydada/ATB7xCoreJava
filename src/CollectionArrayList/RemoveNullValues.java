package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class RemoveNullValues {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", null, "Python", null, "C++"));

		list.removeIf(Objects::isNull);

		System.out.println("After removing nulls: " + list);

	}

}
