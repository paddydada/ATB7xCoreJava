package SearchAlgo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
//		int[] a = { 1, 3, 2, 7, 9, 10 };
//		int target = 9;
//		// Sort the array (required for binary search)
//		Arrays.sort(a);
//		// Perform binary search
//		int result = binarySearch(a, target);
//		if (result != -1) {
//			System.out.println("Element is found at index " + result);
//		} else {
//			System.out.println("Element not found.");
//		}
		
		 int[] a = { 1, 3, 2, 7, 9, 10 };
	        int target = 10;
	        Arrays.sort(a);
	        int left = 0; int right = a.length -1;
	        int mid = left + (right - left)/2 ;
	        
	        System.out.println("Try programiz.pro" +right  +" "+ mid);

	}

	// Binary Search Method
	private static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the target is at the middle
			if (array[mid] == target) {
				return mid;
			}

			// If target is greater, ignore the left half
			if (array[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				right = mid - 1;
				
			}
			
			
		}

		return -1; // Return -1 if element is not found
	}
}
