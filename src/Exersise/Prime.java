package Exersise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

		String input = bufferReader.readLine();

		bufferReader.close();
		BigInteger number = new BigInteger(input);

		if (number.isProbablePrime(1)) {

			System.out.println("prime number");
		} else {
			System.out.println("not prime");
		}

	}
}
