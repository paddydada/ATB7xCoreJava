package CoreJavaDemo;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 28;
		boolean prime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
			}
			break;

		}
		if (prime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

	}

}
