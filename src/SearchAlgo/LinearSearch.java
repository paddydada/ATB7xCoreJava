package SearchAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 7, 9, 10 };
		int target = 9;

		int result = linearSearch(a, target);

		if (result != -1) {
			System.out.println("Element is found at index " + result);
		} else {
			System.out.println("Element not found.");
		}
	}

	// Reusable Linear Search Method
	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
