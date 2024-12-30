package CoreJavaDemo;

public class SperateNumerString {

//	“09/24/2015”. seperate numbers only from this string.
	public static void main(String[] args) {
		String a = "09/24/2015";
		String numeric = "";
		int len = a.length() - 1;
		for (int i = 0; i <= len; i++) {
			char ch = a.charAt(i);
			if (Character.isDigit(ch)) {
				numeric += ch;
//	            System.out.print(ch + " is a Numeric character.");

			} else if (Character.isLetter(ch)) {
				// System.out.print(ch + " is an Alphabet character.");
			} else {
				// System.out.println(ch + " is a Special character.");
			}
		}

		System.out.print(numeric);

	}
}

//o/p 09242015