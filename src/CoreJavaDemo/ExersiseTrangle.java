package CoreJavaDemo;

import java.util.Scanner;

public class ExersiseTrangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input triangle side lengths
		System.out.println("Enter the lengths of the three sides of the triangle:");
		System.out.print("Side 1: ");
		int side1 = scanner.nextInt();
		System.out.print("Side 2: ");
		int side2 = scanner.nextInt();
		System.out.print("Side 3: ");
		int side3 = scanner.nextInt();
		
		// Determine triangle type
		if (side1 == side2 && side2 == side3) {
			// All sides are equal - 5 5 5
			System.out.println("Triangle is equilateral.");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			// Exactly two sides are equal 3 3 5
			System.out.println("Triangle is isosceles.");
		} else {
			// No sides are equal 1 2 3
			System.out.println("Triangle is scalene.");
		}

		scanner.close();
	}
}
