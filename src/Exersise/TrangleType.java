package Exersise;

import java.util.Scanner;

public class TrangleType {
	// ✅ Triangle Classifier:
	// Write a program that classifies a triangle based on its side lengths.
	// Given three input values representing the lengths of the sides, determine
	// if the triangle is equilateral (all sides are equal),
	// isosceles (exactly two sides are equal), or
	// scalene (no sides are equal).
	// Use an if-else statement to classify the triangle.
	// side1, side2, side3 ->

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lengths of the three sides of the triangle:");
		System.out.print("Side 1: ");
		int side1 = scanner.nextInt();
		System.out.print("Side 2: ");
		int side2 = scanner.nextInt();
		System.out.print("Side 3: ");
		int side3 = scanner.nextInt();

		if (side1 == side2 && side1 == side3) {
			// Exactly same
			System.out.println("Trangle is equilateral");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			// Exactly two sides are equal 3 3 5
			System.out.println("Triangle is isosceles.");
		} else {
			// No sides are equal 1 2 3
			System.out.println("Triangle is scalene.");
		}

	}
}
