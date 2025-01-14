package Static;

public class Demo2 {

    // Static method abc
    public static void abc() {
        System.out.println("abc method in Demo2 class");
    }

    // Static method pqr
    public static void pqr() {
        System.out.println("PQR method in Demo2 class");
    }

    // Static method xyz
    public static void xyz() {
        System.out.println("XYZ method in Demo2 class");
    }
    
    //non static
    
    public void lmn() {
    	System.out.println("Non static method");
    }

    public static void main(String[] args) {
        // Access static method directly
        System.out.println("Direct access call:");
        abc();

        // Access static method using class name
        System.out.println("Second access using class name:");
        Demo2.pqr();

        // Access static method using object reference
        System.out.println("Third access using object reference:");
        Demo2 obj = new Demo2();
        obj.xyz();
    }
    
    
}
