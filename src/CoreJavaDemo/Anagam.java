package CoreJavaDemo;

import java.util.Arrays;

public class Anagam {

	public static boolean isAnagram(String str1, String str2) {
		// If lengths are not the same, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Check if sorted arrays are equal
		return Arrays.equals(arr1, arr2);

	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
}
