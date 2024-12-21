package NonStatic;

public class MaxNum {
	//	non Static method with int return type and 0 arguments 
	//	write logic to find max value and return the max value
	public int max() {
		int[] input = { 20, 30, 40, 10, 50 };
		int len = input.length - 1;
		int max = input[0];
		for (int i = 0; i <= len; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNum m = new MaxNum();
		int maxnumber = m.max();
		System.out.println("max number is " + maxnumber);
	}
}
