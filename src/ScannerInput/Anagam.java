package ScannerInput;

import java.util.Arrays;

public class Anagam {

	public static void main(String[] args) {

		String a = "amdak";

		String b = "kadam";

		char[] first = a.toCharArray();
		char[] second = b.toCharArray();

		Arrays.sort(first);
		Arrays.sort(second);

		System.out.println(first + " " + second);

		if (Arrays.equals(first, second)) {

			System.out.println("string a b is anagam");
		} else {
			System.out.println("string a b not anagam");
		}
	}

}
