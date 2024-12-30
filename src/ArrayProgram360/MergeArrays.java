package ArrayProgram360;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8 };

		int[] mergeArray = new int[array1.length + array2.length];

//		Copies elements from a source array to a destination array.
//		The first parameter is the source array.
//		The second parameter is the starting index in the source array.
//		The third parameter is the destination array.
//		The fourth parameter is the starting index in the destination array.
//		The fifth parameter is the number of elements to copy.

		System.arraycopy(array1, 0, mergeArray, 0, array1.length);

		System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);

		Arrays.sort(mergeArray);

		System.out.println("mergeArray " + Arrays.toString(mergeArray));

	}
}
