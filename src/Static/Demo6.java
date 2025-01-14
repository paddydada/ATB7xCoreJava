package Static;

public class Demo6 {

//	Static method with return type and 0 arguments

	public static String concatString() {
		String a = "172rohit@#$$PATIL9182";

		// String xyz = a.replaceAll("[^A-Za-z]", "");
		String uc = a.replaceAll("[^A-Z]", "");

		String lc = a.replaceAll("[^a-z]", "");

		String xyz = lc.concat(uc);

		return xyz;
	}

	public static void main(String[] args) {

		String pqr = Demo6.concatString();

		System.out.println(pqr);
	}

}
