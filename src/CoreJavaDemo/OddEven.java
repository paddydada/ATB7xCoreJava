package CoreJavaDemo;

public class OddEven {

    public static void main(String[] args) {
        // Create arrays to store even and odd numbers
        int[] even = new int[10]; // Size is 10 since there are 10 even numbers between 11 and 30
        int[] odd = new int[10];   // Size is 10 since there are 10 odd numbers between 11 and 30
        int evenIndex = 0, oddIndex = 0;

        // Loop through numbers from 11 to 30
        for (int i = 11; i <= 30; i++) {
            if (i % 2 == 1) { 
                odd[oddIndex] = i; 
                oddIndex++;
                System.out.println("Odd: " + i); 
            } else { // Otherwise, it's even
                even[evenIndex] = i;
                evenIndex++;
            }
        }

        // Optional: Print all even numbers if needed
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println("even "+even[i]);
        }
    }
}
