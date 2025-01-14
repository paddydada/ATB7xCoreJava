package StringProgram;

public class ReverseStringMpahis {
	public static void main(String[] args) {
		String a = " I\"Love\"India\" ";

		// Replace double quotes with spaces
		String d = a.replace("\"", " "); 
		int len = d.length(); // 
		String rev = "";

		// Iterate backward through the modified string
		for (int i = len - 1; i >= 0; i--) {
			char p = d.charAt(i);
			if (Character.isAlphabetic(p) || p == ' ') { 
				rev += p; 
			}
		}

		System.out.println(d.trim()); 
		System.out.println(rev.trim());	}
}
