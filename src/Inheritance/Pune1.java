package Inheritance;

public class Pune1 {


	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.p1();
		obj.p2();
		obj.p3();
		obj.c1();
		obj.c2();

		// we mention object of ParentClass and reference of ParentClass
		// this allow to access all the methods only ParentClass.
//		ParentClass obj =new ParentClass();
//		obj.p1();
//		obj.p2();
//		obj.p3();

	}

}
