package StringProgram;

public class ReverseString {

	public static void main(String[] args) {

		// Using StringBuffer class
		StringBuffer sbf = new StringBuffer("MyJava");

		System.out.println(sbf.reverse());
		
		//Using iterative method
		String str = "MyJava";
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : avaJyM
		}
		
		//using for loop
		System.out.println();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}
		
	}

}
