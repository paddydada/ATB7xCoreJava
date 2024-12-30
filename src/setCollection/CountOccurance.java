package setCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOccurance {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3, 1);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : list) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("Element frequencies: " + map);

	}

}
