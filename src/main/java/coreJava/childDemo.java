package coreJava;


// Child class extends Parent class to override methods
public class childDemo extends parentDemo {

    String name = "QAClickAcademy";

    // Constructor in child class
    public childDemo() {
        super(); // Call to parent class constructor (must be the first line)
        System.out.println("Child class constructor");
    }

    // New method in child class
    public void getStringdata() {
        System.out.println(name);           // Child class name
        System.out.println(super.name);     // Parent class name (using 'super')
    }

    // Overriding getData method from parent class
    @Override
    public void getData() {
        super.getData();                    // Call parent class's getData method
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        // Create an instance of childDemo
        childDemo cd = new childDemo();

        // Call methods
        cd.getStringdata();  // Access name from both child and parent classes
        cd.getData();        // Overridden method behavior
    }
}
