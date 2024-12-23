package CoreJavaDemo;

public class PalindromeDemo {
	public static void main(String[] args) {
		String input = "naydasan";
		String res = "";
		int len = input.length() - 1;
		for (int i = len; i >= 0; i--) {

			res += input.charAt(i);
		}
		if (input.equals(res)) {
			System.out.println("Given input is a palindrome");
		} else {
			System.out.println("Given input is not a palindrome");
		}

	}
}