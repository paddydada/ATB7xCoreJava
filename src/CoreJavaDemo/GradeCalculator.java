package CoreJavaDemo;

import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        // Grade scale:
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the grade in number format (0 to 100):");
        int grade = scanner.nextInt();
        
        // Checking if grade is valid
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid input: Grade cannot be negative or greater than 100.");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("A grade");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B grade");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C grade");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D grade");
        } else {
            System.out.println("F grade");
        }
        
        // Closing the scanner
        scanner.close();
    }
}
