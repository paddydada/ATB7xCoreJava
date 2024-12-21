package ArrayProgram360;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveUisngLoop {

	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 2, 4, 5, 6 };

		int len = input.length;

		int[] temp = new int[len];
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[count] = input[i];
				count++;
			}
		}

		int[] result = Arrays.copyOf(temp, count);

		System.out.println("Original Array: " + Arrays.toString(input));
		System.out.println("Array after removing duplicates: " + Arrays.toString(result));

	}

}
