package Static;

public class Demo1 {

//	public static void findMaxValue() {
//		int[] xyz = { 100, 200, 300, 4500, 34, 456 };
//		int max = xyz[0];
//
//		for (int i = 0; i < xyz.length; i++) {
//			if (xyz[i] > max) {
//				max = xyz[i];
//			}
//		}
//
//		System.out.println(max);
//
//	}
//
//	public static void main(String[] args) {
//		// 1) findMaxValue();
//		// 2) Demo1.findMaxValue();
//		// 3
//		Demo1 obj = new Demo1();
//		obj.findMaxValue();
//	}
	
	
	public static void findMaxValue() {
	    int[] xyz = {100, 200, 300, 4500, 34, 456};
	    int max = xyz[0];

	    // Track memory usage before and after the method
	    long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

	    for (int i = 0; i < xyz.length; i++) {
	        if (xyz[i] > max) {
	            max = xyz[i];
	        }
	    }

	    long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    System.out.println("Max Value: " + max);
	    System.out.println("Memory used: " + (memoryAfter - memoryBefore) + " bytes");
	}

	public static void main(String[] args) {
	    findMaxValue();
	}

}
