package StringProgram;

public class CountCharacterOccurence {
	public static void main(String[] args) {

		String s = "Java is java again java again";
		Character ch = 'a';

	
		int count = s.length() - s.replace("a", "").length();

		System.out.println(count);
		
	}

}
