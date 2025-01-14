package ScannerInput;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter user name");
			String name = scanner.nextLine();

			System.out.println("ENter your age");
			int age = scanner.nextInt();

			System.out.println("My name is " + name + "age is " + age);
		}

		catch (Exception e) {
			System.out.println(e);

			// age as string enter java.util.InputMismatchException
		}

	}
}
