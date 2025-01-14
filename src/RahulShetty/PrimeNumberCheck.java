package RahulShetty;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// Example number to check if it is a prime number
		// int number = 29;
		int number = 30;

		// Check if the number is prime and print the result
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	// Method to check if a number is prime
	public static boolean isPrime(int number) {
		// Check for numbers less than 2
		if (number <= 1) {
			return false;
		}

		// Check for divisors from 2 to the square root of the number
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
