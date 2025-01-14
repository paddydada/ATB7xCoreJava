package Inheritance;

class Cycle {
    // Method in the superclass (Cycle)
    void printDetails() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class Motorcycle extends Cycle {
    // Method in the subclass (Motorcycle) overriding the superclass method
    @Override
    void printDetails() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        // Calling the superclass method using super to print additional information
        super.printDetails();
    }
}

public class CallSuper {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.printDetails();  // Calling the overridden method
    }
}

