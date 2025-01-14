package StringProgram;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {

		System.out.println("enter th string");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		// input
		String[] words = input.split(" ");

		int count = words.length;

		System.out.println(count);
	}

}
