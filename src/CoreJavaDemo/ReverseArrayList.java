package CoreJavaDemo;

import java.util.ArrayList;

import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(95);
		list.add(50);

		System.out.println("Original ArrayList: " + list);

		Collections.reverse(list);

		System.out.println("Revserse ArrayList: " + list);

	}

}
