package CoreJavaDemo;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("ENter the side 1");
		int side1 = scanner.nextInt();
		System.out.println("ENter the side 2");
		int side2 = scanner.nextInt();
		System.out.println("ENter the side 3");
		int side3 = scanner.nextInt();

		if (side1 == side2 && side2 == side3) {
			System.out.println("Equilateral triangle");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("Isosceles triangle");
		} else {
			System.out.println("Scalene triangle");
		}

		scanner.close();

	}

}
