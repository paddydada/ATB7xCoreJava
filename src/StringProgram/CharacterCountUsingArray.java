package StringProgram;

public class CharacterCountUsingArray {
    public static void main(String[] args) {
        String input = "hello world";
        countCharacters(input);
    }

    public static void countCharacters(String input) {
        // Create an array to store the count of each character (assuming ASCII characters)
        int[] count = new int[256];
        // Convert string to lowercase (optional, for case-insensitive counting)
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Increment the count of the character in the array
            count[ch]++;
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0 && i != ' ') { // We ignore space (optional)
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
