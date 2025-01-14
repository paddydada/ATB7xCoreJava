package OverRide;

// Superclass
class Loan {
	// Method to be overridden
	public void interestRate() {
		System.out.println("The interest rate is 5%.");
	}
}

// Subclass
class HomeLoan extends Loan {
	// Overriding the method from superclass
	@Override
	public void interestRate() {
		System.out.println("The interest rate for Home Loan is 6%.");
	}
}

// Subclass
class PersonalLoan extends Loan {
	// Overriding the method from superclass
	@Override
	public void interestRate() {
		System.out.println("The interest rate for Personal Loan is 8%.");
	}
}
