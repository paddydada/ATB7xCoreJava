package coreJava;

public class ConstrctorDemo {

	// Constructor with String parameter
	ConstrctorDemo(String string) {
		System.out.println("I am in the constructor");
		System.out.println("Constructor argument: " + string);
	}

	// Constructor with two integer parameters
	public ConstrctorDemo(int a, int b) {
		System.out.println("I am in the parameterized constructor");
		int sum = a + b;
		System.out.println("Sum of parameters: " + sum);
	}

	// Default constructor
	public ConstrctorDemo() {
		System.out.println("I am in the default constructor");
	}

	// Method in the class
	public void getData() {
		System.out.println("I am a method in the class");
	}

	// Main method to create objects
	public static void main(String[] args) {
		// Default constructor
		ConstrctorDemo cd = new ConstrctorDemo();
		cd.getData();

		// Constructor with a String parameter
		ConstrctorDemo cds = new ConstrctorDemo("hello");

		// Constructor with two integer parameters
		ConstrctorDemo c = new ConstrctorDemo(4, 5);
	}
}
