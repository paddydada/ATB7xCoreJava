package ArrayProgram360;

public class CheckArraySort {

	public static void main(String[] args) {

//		Check if the array is sorted
		// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 4, 5, 4, 4, 4 };

		System.out.println("Array a is sorted: " + checkArraysorted(a));
		System.out.println("Array b is sorted: " + checkArraysorted(b));

	}

	private static boolean checkArraysorted(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				return false;
			}

		}

		return true;
	}

}
