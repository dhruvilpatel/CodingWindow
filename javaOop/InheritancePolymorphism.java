package javaOop;

class Check{
	String name;
}

public class InheritancePolymorphism {

	public static void main(String[] args) {
		Check c = new Check();
		Method1(c);
	}
	
	public static void Method1(String s) {
		System.out.println("String");
	}
	
	public static void Method1(Check s) {
		System.out.println("Object");
	}
}
