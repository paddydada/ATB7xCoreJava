package StringProgram;

public class CountCharacterOccurence {
	public static void main(String[] args) {

		String s = "Java is java again java again";

		//1 approch
		int count = s.length() - s.replace("a", "").length();
		System.out.println(count);
		
		
		//approch -2 
		int count1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) =='a') {
				count1++;
			}
		}
	
		System.out.println(count1);
		
		
		//approch 
			
		
		
	}

}
