package OverRide;

public class OverridingExample {
    public static void main(String[] args) {
        // Reference of superclass pointing to an object of subclass
        Loan myLoan = new HomeLoan();
        
        myLoan.interestRate(); 
        
        myLoan = new PersonalLoan();
        
        myLoan.interestRate(); // Calls the overridden method in PersonalLoan
    }
}
