package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// add element using add
		list.add("pravin");
		list.add("pranav");
		list.add("prasad");
		list.add("pralhad");
		int sizelist = list.size();

		// size
		System.out.println(sizelist);

		// remove element

		// contains method check verify elemnet exist or not
		boolean check = list.contains("pravn");
		System.out.println(check);

		// remove element
		list.remove("pranav");

		// Access elements

		System.out.println(list.get(1));

		// Change the element of the ArrayList

		list.set(1, "pramod");

		// Access elements

		System.out.println(list.get(1));
		// Remove element from index 2

		System.out.println("Updated ArrayList: " + list);
		System.out.println(sizelist);
		
		
		for(String name:list) {
			System.out.print(name +"   ");
		}
		
		
		list.clear();
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		

	}

}
