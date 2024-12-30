package ArrayProgram360;

public class FindMax {

//	Given an array ‘arr’ of size ‘n’ find the largest element in the array.
//	Example:
//	Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
//	Output: 5
//	Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5};
		
		int max = input[0];
		for(int i=0;i<=input.length-1;i++) {
			
			if(input[i]> max) {
				max = input[i];
			}
		}
		
		System.out.println("the largest element is "+max );
	}
}
