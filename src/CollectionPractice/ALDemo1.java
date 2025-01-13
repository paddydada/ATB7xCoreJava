package CollectionPractice;

import java.util.ArrayList;

public class ALDemo1 {
	
	public static void main(String[] args) {
		ArrayList abc =new ArrayList();
		abc.add(100);
		abc.add('B');
		abc.add("Selenium");
		abc.add(true);
		abc.add(null);
		abc.add(null);
		abc.add('B');
		
		System.out.println(abc.size());
		System.out.println(abc.isEmpty());
		
		System.out.println(abc.get(2));
		
		System.out.println(abc);
	}
	

}
