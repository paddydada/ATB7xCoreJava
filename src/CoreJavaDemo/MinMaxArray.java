package CoreJavaDemo;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] abc = { 450, 100, 200, 300, 400, 600 };

		int max = abc[0];

		int len = abc.length;

		for (int i = 0; i <= len - 1; i++) {
			if (abc[i] > max) {
				max = abc[i];
			}
		}
		System.out.println(max);
	}
}
