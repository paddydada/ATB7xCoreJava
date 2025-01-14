package LeetCode.string;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String[] words = s.trim().split(" ");

		return words[words.length - 1].length();
	}

	public static void main(String[] args) {

		LengthOfLastWord solution = new LengthOfLastWord();

		int len = solution.lengthOfLastWord("Hello World");

		System.out.println(len);
	}

}
