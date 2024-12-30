package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 15, 25));

		int max = Collections.max(list);
		int min = Collections.min(list);
		System.out.println("max element " + max + "   min  " + min);
	}

}

