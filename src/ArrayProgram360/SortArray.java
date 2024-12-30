package ArrayProgram360;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] abc = { 450, 100, 200, 300, 400, 600 };

		System.out.println("Original Array: " + Arrays.toString(abc));

		Arrays.sort(abc);

		System.out.println("Sorted Array: " + Arrays.toString(abc));

	}

}
