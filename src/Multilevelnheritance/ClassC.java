package Multilevelnheritance;
public class ClassC extends ClassB {

	public void c1() {
		System.out.println("C1 method");
	}

	public static void main(String[] args) {

		ClassB obj6 = new ClassC();// we can access ClassA and ClassB
		//obj6.a1();
		//obj6.a2();
		//obj6.a3();
		//obj6.a4();
		obj6.b1();
		obj6.b2();

//		ClassA obj5 =new ClassC();  //we can access ClassA
//		
//		obj5.a1();
//		obj5.a2();
//		obj5.a3();
//		obj5.a4();

//		ClassA obj4 =new ClassB();//we can access ClassA 
//		obj4.a1();
//		obj4.a2();
//		obj4.a3();
//		obj4.a4();

//		ClassC obj3 =new ClassC();//we can access ClassA, ClassB and ClassC
//		obj3.a1();
//		obj3.a2();
//		obj3.a3();
//		obj3.a4();
//		obj3.b1();
//		obj3.b2();
//		obj3.c1();

//		ClassB obj2 =new ClassB();//we can access ClassA and ClassB
//		obj2.a1();
//		obj2.a2();
//		obj2.a3();
//		obj2.a4();
//		obj2.b1();
//		obj2.b2();

//		ClassA obj1 =new ClassA();//we can access 4 Methods from ClassA
//		obj1.a1();
//		obj1.a2();
//		obj1.a3();
//		obj1.a4();

	}

}
