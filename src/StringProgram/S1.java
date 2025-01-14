package StringProgram;

public class S1 {
	public static void main(String[] args) {

		String s1 = "knowledge";
		String s2 = s1; // s2 points to the same "knowledge"
		s1 = s1.concat(" base"); // creates a new String "knowledge base"

		System.out.println(s1);
	}

}
