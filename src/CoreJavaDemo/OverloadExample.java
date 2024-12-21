package CoreJavaDemo;

public class OverloadExample {
    // Overloaded methods with different parameter types

    // Method with one int parameter
    public int searchLoan(int lan) {
        return lan;
    }

    // Method with one String parameter
    public String searchLoan(String laf) {
        return laf;
    }

    // Method with two int parameters
    public int searchLoan(int lin, int amount) {
        return lin + amount;
    }
    
    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        
        // Calling overloaded methods
        System.out.println(example.searchLoan(100));
        System.out.println(example.searchLoan("Home Loan"));
        System.out.println(example.searchLoan(100, 2000));
    }
}
