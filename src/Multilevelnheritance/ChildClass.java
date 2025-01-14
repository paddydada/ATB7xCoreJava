package Multilevelnheritance;

public class ChildClass extends ParentClass {

	@Override
	public String getData(String firstname) {
		return "Child Class: " + firstname;
	}
}
