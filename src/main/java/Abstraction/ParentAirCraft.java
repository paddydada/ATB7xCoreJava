package Abstraction;

public abstract class ParentAirCraft {

	public void engine() {
		System.out.println("follow engine guidline");
	}

	public void safetyGuidLines() {
		System.out.println("follow safety guidline");
	}

	public abstract void bodyColor();
	
	
	//The abstract method logo in type ParentAirCraft can only set a visibility modifier, one of public or protected
	//private abstract void logo();

}
