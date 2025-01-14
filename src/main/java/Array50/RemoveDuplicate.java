package Array50;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

//	Write a program to remove duplicates from an array without using HashMap.

	public static void main(String[] args) {

//		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4, 5, 6));
//
//		ArrayList<Integer> uniqueArray = new ArrayList<Integer>();
//		for (int a : input) {
//			if (!uniqueArray.contains(a)) {
//				uniqueArray.add(a);
//			}
//		}
//
//		Collections.sort(uniqueArray);
//		System.out.println(uniqueArray.toString());

		// 2nd approch

		int[] input = { 1, 3, 5, 2, 4, 5, 6 };

		int len = input.length;

		int[] result = Arrays.stream(input).distinct().toArray();

		System.out.println(Arrays.toString(result));

	}

}
