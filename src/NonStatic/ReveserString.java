package NonStatic;

public class ReveserString {

	// create Non static method with String return type and 0 args
	// write logic to return reverse the String

	public String reverse(String input) {

		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			char b = input.charAt(i);
			rev += b;
		}

		return rev;
	}

	public static void main(String[] args) {

		ReveserString rs = new ReveserString();
		String input = "pravin";
		String result = rs.reverse(input);

		System.out.println(input + "  " + result);
	}
}
