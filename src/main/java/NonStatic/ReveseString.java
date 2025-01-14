package NonStatic;

public class ReveseString {

	// create non static method with String return type
	// write logic to reverse the String

	public String reverseString() {
		String a = "radar";
		String rev = "";// radar

		int b = a.length() - 1;

		for (int i = b; i >= 0; i--) {
			char c = a.charAt(i);// j

			rev = rev + c;
		}

		return rev;// radar
	}

	public static void main(String[] args) {
		// in main method compare actual string and reverse string is same or not,if
		// same then print String is palindrome or if not print String is not Palindrome

		ReveseString obj = new ReveseString();

		// radar
		String xyz = obj.reverseString();

		if (xyz.equals("radar")) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}
}
