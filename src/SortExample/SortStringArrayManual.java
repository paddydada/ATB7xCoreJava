package SortExample;

public class SortStringArrayManual {

	public static void main(String[] args) {

		String[] array = { "Banana", "Apple", "Cherry", "Mango", "Blueberry" };

		// int n = array.length;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[i].compareTo(array[j + 1]) > 0) {

					String temp = array[j];

					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}

		}

		System.out.println("Sorted Array: ");
		for (String str : array) {
			System.out.print(str + " ");
		}

	}
}
