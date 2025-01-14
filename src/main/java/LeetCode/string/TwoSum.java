package LeetCode.string;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // Calculate complement

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No solution found");
	}

	public static void main(String[] args) {

		TwoSum obj = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = obj.twoSum(nums, target); // Call the twoSum method
		System.out.println("Indices: " + result[0] + ", " + result[1]);

	}
}
