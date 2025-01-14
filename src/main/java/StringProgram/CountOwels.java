package StringProgram;

public class CountOwels {

	public static void main(String[] args) {
		String inputS = "India is my country";
		String input = inputS.replaceAll("\\s", "").toLowerCase();
		System.out.println(input);
		int count = 0;
		for (int i = 0; i <= input.length()-1; i++) {
			char inputs = input.toLowerCase().charAt(i);
			if (inputs == 'a' || inputs == 'e' || inputs == 'o' || inputs == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
