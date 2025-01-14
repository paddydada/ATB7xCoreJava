package Static;

import java.util.Arrays;

public class anagram {

	// check String is anagram or not

	public static String checkAnagramString() {
		String a = "madam";
		String b = "care";

		// convert String into char [] array
		char[] abc = a.toCharArray();
		char[] pqr = b.toCharArray();

		// sort the char [] values as per the ascending order
		Arrays.sort(abc);// aadmm
		Arrays.sort(pqr);// acer

		// compare the both array values after sorting
		if (Arrays.equals(abc, pqr)) {
			return "String is anagram";
		} else {
			return "String is not anagram";
		}

	}

	public static void main(String[] args) {

		String p = anagram.checkAnagramString();
		System.out.println(p);
	}

}
