package Multilevelnheritance;

public class OverloadExample {

    // Overloaded method: Single argument
    public static String getData(String firstname) {
        return firstname;
    }

    // Overloaded method: Two arguments
    public static String getData(String firstname, String lastname) {
        String name = firstname + " " + lastname;
        return name;
    }

    // Overloaded method: Three arguments
    public static String getData(String firstname, String midname, String lastname) {
        String name = firstname + " " + midname + " " + lastname;
        return name;
    }

    public static void main(String[] args) {
        // Testing overloaded methods and printing the results
        System.out.println(getData("pravin")); // Calls the single-argument method
        System.out.println(getData("pravin", "kadam")); // Calls the two-argument method
        System.out.println(getData("pravin", "r", "kadam")); // Calls the three-argument method
    }
}
