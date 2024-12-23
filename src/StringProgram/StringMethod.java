package StringProgram;

public class StringMethod {

    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        // Or String s = new String("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());  // String length = 13

        // Returns the character at 3rd index (0-based indexing).
        System.out.println("Character at 3rd position = " + s.charAt(3));  // Character at 3rd position = k

        // Returns the substring from the 3rd index to the end of the string.
        System.out.println("Substring from 3rd position = " + s.substring(3));  // Substring from 3rd position = ksforGeeks

        // Returns the substring from index 2 to 4 (end index is exclusive).
        System.out.println("Substring from index 2 to 5 = " + s.substring(2, 5));  // Substring from index 2 to 5 = eks

        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string = " + s1.concat(s2));  // Concatenated string = GeeksforGeeks

        // Returns the index of the first occurrence of "Share" in s4.
        String s4 = "Learn Share Learn";
        System.out.println("Index of 'Share' = " + s4.indexOf("Share"));  // Index of 'Share' = 6

        // Returns the index of the first occurrence of 'a' starting from index 3.
        System.out.println("Index of 'a' after index 3 = " + s4.indexOf('a', 3));  // Index of 'a' after index 3 = 8

        // Checking the equality of strings (case-sensitive).
        Boolean isEqual = "Geeks".equals("geeks");
        System.out.println("Checking equality of 'Geeks' and 'geeks' = " + isEqual);  // Checking equality of 'Geeks' and 'geeks' = false

        isEqual = "Geeks".equals("Geeks");
        System.out.println("Checking equality of 'Geeks' and 'Geeks' = " + isEqual);  // Checking equality of 'Geeks' and 'Geeks' = true

        // Checking equality of strings (case-insensitive).
        isEqual = "Geeks".equalsIgnoreCase("gEeks");
        System.out.println("Checking case-insensitive equality = " + isEqual);  // Checking case-insensitive equality = false

        // Compare strings lexicographically.
        int asciiDifference = s1.compareTo(s2);
        System.out.println("ASCII difference between s1 and s2 = " + asciiDifference);  // ASCII difference between s1 and s2 = -31

        // Convert the string to lowercase.
        String word1 = "GeeKyMe";
        System.out.println("Lowercase: " + word1.toLowerCase());  // Lowercase: geekyme

        // Convert the string to uppercase.
        String word2 = "GeekyME";
        System.out.println("Uppercase: " + word2.toUpperCase());  // Uppercase: GEEKYME

        // Trim whitespace from the start and end of the string.
        String word4 = " Learn Share Learn ";
        System.out.println("Trimmed string = '" + word4.trim() + "'");  // Trimmed string = 'Learn Share Learn'

        // Replace characters in the string.
        String str1 = "feeksforfeeks";
        System.out.println("Original String = " + str1);  // Original String = feeksforfeeks
        String str2 = str1.replace('f', 'g');
        System.out.println("Replaced 'f' with 'g' -> " + str2);  // Replaced 'f' with 'g' -> geeksgorgeeks
    }
}
