package RahulShetty;

public class CountCharacters {

    public static void main(String[] args) {
        // Example string
        String input = "pravinkadam";
        Character exp ='c';
        // Get the number of characters in the string
        int numberOfCharacters = countCharacters(input,exp);

        // Print the number of characters
        System.out.println("The number of characters in the string is: " + numberOfCharacters);
    }

    // Method to count the number of characters in a string
    public static int countCharacters(String input,char exp) {
        // Use the length() method to get the number of characters
    	int count =0;
    	for (int i = 0; i < input.length()-1; i++) {
			
    		if(input.charAt(i)== 'a') {
    			count++;
    		}
    			
		}
        return count;
    }
}
