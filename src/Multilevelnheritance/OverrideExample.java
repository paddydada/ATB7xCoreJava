package Multilevelnheritance;

public class OverrideExample {

	String name = "QAClickAcademy";

	public OverrideExample() {
		super();// this should be always be at first line
		System.out.println("child class construtor");

	}

	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		System.out.println(parent.getData("Pravin"));

		// Using ChildClass reference
		ParentClass child = new ChildClass(); // Polymorphism
		System.out.println(child.getData("Pravin"));

		// Using GrandChildClass reference
		ParentClass grandChild = new GrandChildClass(); // Polymorphism
		System.out.println(grandChild.getData("Pravin"));

	}

}
