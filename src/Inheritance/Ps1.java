package Inheritance;

public class Ps1 extends PS {
	public static void main(String[] args) {

		PS obj = new PS();
		// static method
		obj.doThis();
		PS.doThis();
		doThis();

		// nonstatic

		// doThis1();
		obj.doThis1();
	}

}
