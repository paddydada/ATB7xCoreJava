package CoreJavaDemo;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name");

		String name = sc.next();

		System.out.println("enter your age");
		int age = sc.nextInt();

		System.out.println("Hello, " + name + "! You are " + age + " years old.");

		sc.close();

	}

}
