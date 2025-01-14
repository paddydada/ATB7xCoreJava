package CoreJavaDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {
		// Example list of elements
		List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 4, 5, 3, 2, 2, 2);

		// Call the function to find the most frequent element
		int mostFrequent = findMostFrequentElement(list);

		// Output the result
		System.out.println("Most frequent element: " + mostFrequent);
	}

	public static int findMostFrequentElement(List<Integer> list) {
		// Use a HashMap to store the frequency of each element
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Iterate through the list and count each element's frequency
		for (int element : list) {
			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
		}

		// Variables to track the most frequent element and its count
		int mostFrequentElement = list.get(0);
		int maxCount = 0;

		// Iterate through the map to find the element with the highest frequency
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentElement = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return mostFrequentElement;
	}
}
