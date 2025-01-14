package LeetCode.string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int n = 0;
        
        // Ensure valid input for the number of test cases
        try {
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The first line must be an integer indicating the number of test cases.");
            scanner.close();
            return;
        }
        
        // Process each test case
        for (int i = 0; i < n; i++) {
            String pattern = scanner.nextLine();
            // Check if the pattern is valid
            try {
                Pattern.compile(pattern);  // Use java.util.regex.Pattern here
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}


//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat

//Valid
//Invalid
//Invalid
