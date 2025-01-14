package ArraySearch;

import java.util.Arrays;

public class SortArrayInterview {

	// Use only 1 for loop, Iterate arry only once.
	public static void main(String[] args) {

//		Given an array consists of 0,1,2 sort that array. 
//		Example arr=[2,0,0,1,0,2,1]
//		output : arr = [0,0,0,1,1,2,2]
		int[] arr = { 2, 0, 0, 1, 0, 2, 1 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) { // Outer loop for passes
			for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));

	}

}
