package Static;

public class Demo5 {

	/// create static method with 3 int args and find max value

	public static void findMaxValue(int a, int b, int c) {

		if ((a > b) && (a > c)) {
			System.out.println("A is max number");
		} else if (b > c) {
			System.out.println("B is Max Number");
		} else {
			System.out.println("C is max Number");
		}
	}

	public static void main(String[] args) {
		Demo5.findMaxValue(100, 200, 3002);

		findMaxValue(120, 32, 30);

	}

}
