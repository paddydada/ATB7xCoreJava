package Abstraction;

public class ChildAirline extends ParentAirCraft {

	public static void main(String[] args) {

		ChildAirline obj = new ChildAirline();
		obj.bodyColor();
		obj.engine();
		obj.safetyGuidLines();
		
		
		//ParentAirCraft obj2 =new  ParentAirCraft();
		//cant allow create instrance of abstact class 
	}

	@Override
	public void bodyColor() {
		System.out.println("ChildAirline body is white");

	}
}
