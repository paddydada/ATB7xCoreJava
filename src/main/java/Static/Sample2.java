package Static;

// Sample2 class extends Demo2, inheriting its static methods
public class Sample2 extends Demo2 {

    public static void main(String[] args) {
        
        // Access static methods directly from the parent class (Demo2)
        System.out.println("Accessing static methods directly from Sample2:");
        abc(); // Direct call to static method abc() from Demo2
        xyz(); // Direct call to static method xyz() from Demo2
        pqr(); // Direct call to static method pqr() from Demo2
       // lmn();  Cannot make a static reference to the non-static method lmn() from the type Demo2

        // Access static methods using the class name (Demo2)
        System.out.println("Accessing static methods using class name:");
        Demo2.abc(); // Using class name to call abc()
        Demo2.pqr(); // Using class name to call pqr()
        Demo2.xyz(); // Using class name to call xyz()

 
        // Access static methods using an instance of the Demo2 class
        System.out.println("Accessing static methods using an object of Demo2:");
        Demo2 d = new Demo2();
        d.abc(); // Calling abc() through the instance (not recommended)
        d.pqr(); // Calling pqr() through the instance (not recommended)
        d.xyz(); // Calling xyz() through the instance (not recommended)
        
        d.lmn(); //non static method cam accees when call object of instance
    }
}
