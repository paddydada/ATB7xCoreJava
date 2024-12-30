package Static;

public class Demo3 {
	//find the max values from array and return the max value.
	
		public static int findMaxValue()
		{
			int [] abc = {10,330,4344,2454,355,5555};
			int max = abc[2];
			
			for (int i = 0; i < abc.length; i++) 
			{
					if(abc[i]>max)
					{
						max=abc[i];
					}
			}
			
			return max;
		}
		

		public static void main(String[] args) {
			
			int p = findMaxValue();
			System.out.println(p);
		}


}
