package CollectionArrayList;

import java.util.ArrayList;

public class CheckEmptyArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		if (list.isEmpty()) {
			System.out.println("list is empty");
		} else {
			System.out.println("list is not empty " + list.size());
		}

		list.add(10);
		if (!list.isEmpty()) {
			System.out.println("The ArrayList now contains: " + list);
		}
	}

}
