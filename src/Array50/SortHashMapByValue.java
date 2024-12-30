package Array50;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Ajay", 1);
		map.put("Jayesh", 4);
		map.put("neeraj", 3);
		map.put("nilesh", 2);

		System.out.println("HashMap before sorting: " + map);

		TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
		System.out.println("HashMap after sorting by keys: " + sortedMap);

		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
