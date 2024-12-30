package RahulShetty;

public class SwappNumber {

    // Question 2: Write a Java Program to swap two given Strings

    public static void main(String[] args) {

        // Define two strings s1 and s2 that we need to swap.
        String s1 = "Pravin";
        String s2 = "Kadam";

        // Concatenate s1 and s2 and assign the result to s1.
        s1 = s1 + s2;
        System.out.println("After concatenation, s1: " + s1);

        // Extract the original s1 from the concatenated string and assign it to s2.
        s2 = s1.substring(0, s1.length() - s2.length());
        System.out.println("After extracting to s2: " + s2);

        // Extract the original s2 from the concatenated string and assign it to s1.
        s1 = s1.substring(s2.length());
        System.out.println("After extracting to s1: " + s1);
    }
}
