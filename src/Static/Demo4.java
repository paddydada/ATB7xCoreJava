package Static;

public class Demo4 {
	// Method to compare two strings
	public static void compareString(String a, String b) {
		// Comparing strings using equals method
		System.out.println(a.equals(b)); // true if both strings are equal
		System.out.println(a.equalsIgnoreCase(a)); // true, comparing a with itself, ignoring case

		// Comparing references of the strings
		System.out.println(a == b); // true if both references point to the same object

		// Substring operation
		System.out.println(a.substring(0)); // Prints the whole string "RestApi"
		System.out.println(a.substring(0).equals(b)); // true, comparing substring with b

		// Logical operations with string comparison
		System.out.println(a.equals(b) && true); // true, since a equals b
		System.out.println(a.equals(b) && false); // false, regardless of a's value
		System.out.println(!a.equals(b)); // false, since a equals b
	}

	public static void main(String[] args) {
		System.out.println("Main Method is Started");
		// Calling the compareString method with two identical strings
		Demo4.compareString("RestApi", "RestApi");
		System.out.println("Main method is ended");
	}
}
