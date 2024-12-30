package StringProgram;

public class ReverseMix {

//	We have string which contains numerals, alphabets, special characters
//
//	Ex: String input = "34auto35qa@sdet?25year";
//
//	We need to reverse the alphabetic characters only. So, expected output is
//	𝟑𝟒𝐨𝐭𝐮𝐚𝟑𝟓𝐚𝐪@𝐭𝐞𝐝𝐬?𝟐𝟓𝐫𝐚𝐞𝐲
	public static void main(String[] args) {

		String input = "34auto35qa@sdet?25year";

		char[] charArray = input.toCharArray();

		int len = charArray.length;

		System.out.println(len);

		StringBuilder alphabetCollector = new StringBuilder();

		for (char ch : charArray) {
			if (Character.isAlphabetic(ch)) {
				alphabetCollector.append(ch);
			} else {
				reverseAlphabets(alphabetCollector);
				System.out.print(ch);
			}

		}
		reverseAlphabets(alphabetCollector);

		// o/p: 34otua35aq@teds?25raey

	}

	private static void reverseAlphabets(StringBuilder alphabetCollector) {

		for (int i = alphabetCollector.length() - 1; i >= 0; i--) {
			System.out.print(alphabetCollector.charAt(i));
		}

		// System.out.print(alphabetCollector.reverse());
		alphabetCollector.setLength(0);
	}

}
