package ArraySearch;

import java.util.Arrays;

public class linearSearch {

	public static void main(String[] args) {
		int[] data = { 23, 45, 11, 12, 23, 55, 67, 33, 88 };
		int searchElement = 451;
		System.out.println("is number found: " + searchMethod(data, searchElement));

	}

	public static boolean searchMethod(int[] num, int searchElement) {
		Arrays.sort(num);
		boolean isFound = false;
		for (int num1 : num) {
			if (num1 == searchElement) {
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Number not found in Arrays!");
		}
		return isFound;
	}
}
