package CoreJavaDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        // Check if the strings are anagrams
        if (isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        
        scanner.close();
    }

    private static boolean isAnagram(String a, String b) {
        // Normalize the strings to lower case
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();

        // Sort the character arrays
        Arrays.sort(aCharArray);
        Arrays.sort(bCharArray);

        // Compare sorted arrays
        return Arrays.equals(aCharArray, bCharArray);
    }
}
