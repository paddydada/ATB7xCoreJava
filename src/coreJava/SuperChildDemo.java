package coreJava;

public class SuperChildDemo extends SuperParentDemo {

	String name = "Pravin"; // Child class variable

	// Constructor for SuperChildDemo
	public SuperChildDemo() {
		super(); // Calls the parent class constructor
		System.out.println("Child class constructor");
	}

	// Method to demonstrate usage of super and this
	public void displayNames() {
		System.out.println("Child class variable: " + this.name); // Refers to the child class variable
		System.out.println("Parent class variable: " + super.name); // Refers to the parent class variable
	}

	// Overriding the getData method
	@Override
	public String getData() {
		// Calling parent class getData method using super
		String parentData = super.getData();
		System.out.println("Parent class getData(): " + parentData);

		// Returning child class data
		return "Child class data";
	}

	public static void main(String[] args) {
		// Creating an object of the child class
		SuperChildDemo childDemo = new SuperChildDemo();

		// Demonstrating the use of super and this
		childDemo.displayNames();

		// Calling the overridden method
		String data = childDemo.getData();
		System.out.println("Child class getData(): " + data);
	}
}

//Constructors:
//
//The super() call in the child class constructor invokes the parent class constructor.
//Accessing Variables:
//
//this.name: Accesses the child class variable.
//super.name: Accesses the parent class variable.
//Overridden Methods:
//
//The child class overrides the getData() method.
//The super.getData() call accesses the parent class method.


//super:
//Refers to the parent class and is used to:
//Access parent class variables when there's a name conflict with child class variables.
//Call parent class methods.
//Call parent class constructors.
//
//this:
//
//Refers to the current instance of the class and is used to:
//Access instance variables of the current class when there’s a name conflict with method parameters.
//Call other constructors of the same class.
//Pass the current instance as a parameter.