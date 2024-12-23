package LeetCode.string;

public class StringSperate {

	public static void main(String[] args) {
		String input = "pravin234@gmail$3@";
		int len = input.length() - 1;
		String alphbetResult = "";
		String numericResult = "";
		  String specialCharResult = "";
		for (int i = 0; i < len; i++) {
			char inputChar = input.charAt(i);

			if (Character.isLetter(inputChar)) {
				alphbetResult += inputChar; // Add letters to alphbetResult
			} else if (Character.isDigit(inputChar)) {
				numericResult += Character.getNumericValue(inputChar);
			} else {
				specialCharResult += inputChar; // Add special characters
			}
		}

		System.out.println("alphbet " + alphbetResult);

		System.out.println("numeric is " + numericResult);
		System.out.println(" Specail charachter " + specialCharResult);

	}

}


