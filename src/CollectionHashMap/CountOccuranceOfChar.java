package CollectionHashMap;

import java.util.HashMap;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		//String str = "India is my country";
		String str ="Java Program To Count Occurrences Of Each Character In String"; 
		
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(int i=0;i<= str.length()-1;i++) {
			
			char currentChar = str.charAt(i);
			
			charCount.put(currentChar,charCount.getOrDefault(currentChar,0)+1);
			
		}
		
		System.out.print(charCount);

	}
}
