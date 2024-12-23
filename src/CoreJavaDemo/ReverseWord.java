package CoreJavaDemo;

public class ReverseWord {

	public static void main(String[] args) {

		String input = "apvsds";
		int len = input.length() - 1;

		System.out.println(len);

		for (int i = len; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}

}
