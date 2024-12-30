package CoreJavaDemo;

import java.util.Scanner;

public class TakeInput {

//	 How to Take Input from Users?

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");

		String name = scanner.nextLine();

		System.out.println(name);

		System.out.println("ENter the mobile number");

		long mobileNumber = scanner.nextLong();

		System.out.println(mobileNumber);

		scanner.close();
	}

}
