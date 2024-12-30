package CollectionArrayList;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<Object> abc = new ArrayList<>();
		abc.add(100);
		abc.add('B');
		abc.add("Selenium");
		abc.add(true);
		abc.add(null);
		abc.add(null);
		abc.add('B');

		// add element in collection

		// size method
		System.out.println(abc.size());
		// check empty isEmpty
		System.out.println(abc.isEmpty());

		System.out.println(abc.get(2));

		System.out.println(abc);
		System.out.println(abc.contains('B'));

		ArrayList<Object> abc1 = new ArrayList<>();

		abc1.add('B');

		Boolean check = abc.containsAll(abc1);
		System.out.println(check);
	}

}

//duplicate allow , multiple null allow ,  