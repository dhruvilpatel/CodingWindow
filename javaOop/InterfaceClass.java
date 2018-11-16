package javaOop;

public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cant Instantiate Abtract class
		//		IRect ir = new IRect(2,5);
		IRect ir = new IRect2(2,5);
		System.out.println(ir.area());
		ir.Type();
		ir.Extra();
		System.out.println(ir.x);
		ICircle ic = new ICircle(5);
	}

}


interface FullDeclaredDefinitions{
	
	void Value();
		
}

interface IshapeAbove extends FullDeclaredDefinitions{
	 final int x = 10;
//	 public void method();

}
interface IShape extends IshapeAbove{

	int area();
	void Type();
	
}

class ICircle implements IShape{
	int radius;
	
	ICircle(int radius){
		this.radius = radius;
	}
	
	public void Type(){
		System.out.println("This is Circle");
	}
	
	public int area(){
		return radius * radius;
	}

	@Override
	public void Value() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class IRect implements IShape{
	int len, width;
	IRect(int x, int y) {
		this.len = x;
		this.width = y;
		}
	public void Type(){
		System.out.println("This is Rect");
	}
	public void Extra(){
		System.out.println("Thie is an Extra Method");
	}
}

class IRect2 extends IRect{
	int len, width;
	IRect2(int x, int y) {
		super(x,y);
		this.len = x;
		this.width = y;
		}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return len * width;
		
	}

	@Override
	public void Value() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}