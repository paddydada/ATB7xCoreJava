package LeetCode.string;

import java.util.Scanner; // Import the Scanner class
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    // Regular expression pattern for validating IP addresses
    public String pattern = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-1]?[0-9][0-9]?)$";
}

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner is used for input
        MyRegex myRegex = new MyRegex();
        
        // Read input until the end of the file
        while (scanner.hasNext()) {
            String ipAddress = scanner.next();
            // Create a Pattern object
            Pattern pattern = Pattern.compile(myRegex.pattern);
            // Create a Matcher object
            Matcher matcher = pattern.matcher(ipAddress);
            // Check if the IP address matches the pattern
            System.out.println(matcher.matches());
        }
        
        scanner.close(); // Close the scanner
    }
}


//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP
//
//true
//true
//true
//false
//false
//false

