package NonStatic;

public class Palindrome {

	public String reverseString() {
		String a = "java";
		String rev = "";// avaj
		int b = a.length() - 1;
		for (int i = b; i >= 0; i--) {
			char c = a.charAt(i);// j
			rev = rev + c; // "ava" + 'j' ="avaj"
		}
		return rev;// avaj
	}
	public static void main(String[] args) {
		// in main method compare actual string and reverse string is same or not,if
		// same then print String is palindrome or if not print String is not Palindrome
		Palindrome obj = new Palindrome();
		// avaj
		String xyz = obj.reverseString();
		if (xyz.equals("java")) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
}
