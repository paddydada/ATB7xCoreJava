package CoreJavaDemo;

import java.util.Scanner;

public class TablePrint {
	
	public static void main(String[] args) {
//		able Print using System.out.printf
//
//		Print  lines of output; each line  (where ) contains the  of  in the form:
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num * i );
		}
		sc.close();

	}
	

}
