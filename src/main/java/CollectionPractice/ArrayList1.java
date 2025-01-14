package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		// add
		list.add("manoj");
		list.add(100);
		list.add('B');
		list.add("selenium");
		list.add(true);

		// size()
		System.out.println(list.size());

		// empty
		System.out.println(list.isEmpty());

		// remove
		list.remove(3);

		System.out.println(list);

		// access element
		System.out.println(list.get(1));
		System.out.println(list.indexOf("B"));
	
	}

}
