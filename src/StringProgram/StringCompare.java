package StringProgram;

public class StringCompare {

	public static void main(String[] args) {

		String str1 = "Learn Java";
		String str2 = "Learn Java";
		String str3 = "Learn Kolin";
		int result;

		// comparing str1 with str2
		result = str1.compareTo(str2);

		System.out.println(result); // 0

		// comparing str1 with str3
		result = str1.compareTo(str3);

		System.out.println(result); // -1

		// comparing str3 with str1
		result = str3.compareTo(str1);

		System.out.println(result); // 1

		if (str1.compareTo(str2) == 0) {

			System.out.println("str1 and str2 are equal");
		} else {
			System.out.println("str1 and str2 are not equal");
		}

		String s4 = "Amit";
		String s5 = "amit";

		System.out.println(s4.equals(s5)); // false

		System.out.println(s4.equalsIgnoreCase(s5)); // true

		// length

		System.out.println(s4.length());

		// Java String replace()

		String r1 = "Pravin Want a Learn";
		r1.replace("L", "");
		System.out.println(r1.replace("L", ""));

	}

}
