package coreJava;

// Function Overloading: Same method name, but different argument count or types
public class childlevel {

    // Overloaded method with one integer argument
    public void getData(int a) {
        System.out.println(a);
    }

    // Overloaded method with one String argument
    public void getData(String a) {
        System.out.println(a);
    }

    // Overloaded method with two integer arguments
    public void getData(int a, int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Create an instance of childlevel
        childlevel cl = new childlevel();
        cl.getData(2);              // Calls method with one int parameter
        cl.getData("hello");        // Calls method with one String parameter
        cl.getData(2, 5);           // Calls method with two int parameters
    }
}
