package javaOop;

@FunctionalInterface
interface Method1{
	public void Method();
//	public default void Method() {
//		System.out.println("Method 1 called");
//	};
}
interface Method2 extends Method1{
	public default void Method() {
//		Method1.super.Method();
		System.out.println("Method 2 called");
	};
}

public class MultipleInterface implements Method1, Method2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj = new MultipleInterface();
		obj.Method();
		
		Method1Class mc = new Method1Class();
		mc.Method();
	}

	@Override
	public void Method() {
		// TODO Auto-generated method stub
		Method2.super.Method();
	}

}

class Method1Class implements Method1{
	
	@Override
	public void Method() {
		System.out.println("Method1Class called");
	}
	
}