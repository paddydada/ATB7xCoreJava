package Inheritance;

public class ChildClass extends ParentClass {

	public void c1() {
		System.out.println("C1 method in Child class");
	}

	public void c2() {
		System.out.println("C2 method in Child class");
	}

	public static void main(String[] args) 
	{
		//if mention object of ChildClass class and reference of ChildClass
		//this allow to access all the method from ParentClass as well as ChildClass.
		ChildClass obj =new ChildClass();
		obj.p1();
		obj.p2();
		obj.p3();
		obj.c1();
		obj.c2();
		
		
		// create object of ParentClass and reference of ParentClass
		// this allow to access only methods from ParentClass.
//		ParentClass obj =new ParentClass();
//		obj.p1();
//		obj.p2();
//		obj.p3();

	}

}
