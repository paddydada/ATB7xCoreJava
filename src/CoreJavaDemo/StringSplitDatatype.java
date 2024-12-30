package CoreJavaDemo;

public class StringSplitDatatype {

	// create static method with 1 String arguments and write logic to find numbers,
	// upper case character, lower case character and special character
	// VVVVVVVVVVVVVVVVVVVVVIIIIIIIIMMMMMMMMMMMMPPPPPPPPPPPPPPPPPP

	public static void findValues(String a) {

		// Remove all digits
		String number = a.replaceAll("[^0-9]", "");
		System.out.println("number: " + number);

		// Remove all lowercase letters
		String lowerCase = a.replaceAll("[^a-z]", "");
		System.out.println("lowerCase: " + lowerCase);

		// Remove all uppercase letters
		String upperCase = a.replaceAll("[^A-Z]", "");
		System.out.println("upperCase: " + upperCase);

		// Remove all alphanumeric characters
		String specialChars = a.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("special characters: " + specialChars);
	}

	public static void main(String[] args) {
		StringSplitDatatype.findValues("90912abcABC2&%#$a234");
	}
}
