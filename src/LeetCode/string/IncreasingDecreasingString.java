package LeetCode.string;

import java.util.TreeMap;

public class IncreasingDecreasingString {
	public String sortString(String s) {

		TreeMap<Character, Integer> count = new TreeMap<>();
		for (char c : s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		StringBuilder result = new StringBuilder();

		while (!count.isEmpty()) {
			// Step 1, 2, 3: Append smallest characters in increasing order
			for (char c : new TreeMap<>(count).keySet()) {
				result.append(c);
				count.put(c, count.get(c) - 1);
				if (count.get(c) == 0) {
					count.remove(c);
				}
			}

			// Step 4, 5, 6: Append largest characters in decreasing order
			for (char c : new TreeMap<>(count).descendingKeySet()) {
				result.append(c);
				count.put(c, count.get(c) - 1);
				if (count.get(c) == 0) {
					count.remove(c);
				}
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		IncreasingDecreasingString solution = new IncreasingDecreasingString();
		String s = "aaaabbbbcccc";

		System.out.println(solution.sortString(s));

		String s1 = "rat";
		System.out.println(solution.sortString(s1));

	}
}
