package CoreJavaDemo;

import java.util.regex.*;

public class EmailValidation {

    public static void main(String[] args) {
        String email = "example@test.com";

        if (isValidEmail(email)) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is not a valid email.");
        }
    }

    public static boolean isValidEmail(String email) {
        // Regex for validating email address
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        
        // Compile regex
        Pattern pattern = Pattern.compile(emailRegex);
        
        // If the email is null, return false
        if (email == null) {
            return false;
        }
        
        // Match the email string with the regex pattern
        return pattern.matcher(email).matches();
    }
}
