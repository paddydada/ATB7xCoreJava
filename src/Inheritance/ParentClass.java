package Inheritance;

public class ParentClass {

	public void p1() {
		System.out.println("P1 Method in Parent class");
	}

	public void p2() {
		System.out.println("P2 method in Parent class");
	}

	public void p3() {
		System.out.println("P3 method in Parent class");
	}

	public static void main(String[] args) {
		// if mention Object of ChildClass and reference of ChildClass
		// this allow to access all the methods from ParentClass and ChildClass
		ChildClass obj = new ChildClass();
		obj.p1();
		obj.p2();
		obj.p3();
		obj.c1();
		obj.c2();

// we mention object of ParentClass and reference of ParentClass
// this allow to access all the methods only ParentClass.
		ParentClass obj3 = new ParentClass();
		obj3.p1();
		obj3.p2();
		obj3.p3();

	}

}
