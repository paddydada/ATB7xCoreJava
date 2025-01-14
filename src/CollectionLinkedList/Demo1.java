package CollectionLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//add method 
		
		list.add(11); 
		list.add(12);
		
		System.out.println(list);
		//
		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		System.out.println("before add"+list1);
		list1.add(6, 61);
		
		System.out.println("after add"+list1);
		
		
		//add first
		list1.addFirst(13);
				
		
		//add colection from one collection to another
		System.out.println("before add list"+list);
		
		list.addAll(list1);
		
		System.out.println("after collection list , list1 add" + list);
		
		list1.addAll(0, list1);
		
		//
		
		
	}

}
