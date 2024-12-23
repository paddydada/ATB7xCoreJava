package ArraySearch;

import java.util.Arrays;

public class binarySearch {
	

	public static void main(String[] args) {
		int[] data = { 23, 45, 11, 12, 23, 55, 67, 33, 88 };
		int searchElement = 5;
		System.out.println("Is element availablity in array: " + searchedElement(data, searchElement));
	}

	private static boolean searchedElement(int[] data, int searchElement) {
		
		Arrays.sort(data);
		boolean isElementFound =false;
		
		int result  = Arrays.binarySearch(data, searchElement);

		isElementFound =result > 0 ?true :false ;
		if(!isElementFound) {
			System.out.println("Element not found");
		}
		return isElementFound;
	}


}
