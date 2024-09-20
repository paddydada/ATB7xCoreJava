package RahulShetty;

public class CountCharacters {

    public static void main(String[] args) {
        // Example string
        String input = "pravin kadam";

        // Get the number of characters in the string
        int numberOfCharacters = countCharacters(input);

        // Print the number of characters
        System.out.println("The number of characters in the string is: " + numberOfCharacters);
    }

    // Method to count the number of characters in a string
    public static int countCharacters(String str) {
        // Use the length() method to get the number of characters
        return str.length();
    }
}
