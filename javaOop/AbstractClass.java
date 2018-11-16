package javaOop;

public class AbstractClass {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape sh = new Shape();
		Rect r = new Rect(2 , 5);
		Circle cv2 = new CircleVersion2(5);
		System.out.println(cv2.area());
		cv2.print();
		cv2.testing();
		cv2.x = cv2.x + 10;
		System.out.println(cv2.x);
		r.print();
		r.x = r.x + 10;
		System.out.println(r.x);
		
	}

}


abstract class Shape{
	String name;
	//You can declare static final int x = 10;
	// but If u declare variable as final you cant change the value;
	static int x = 10;
	Shape(String name){
		this.name = name;
	}
	abstract int area();
	void print(){
		System.out.println("Shape is " + name);
	}
	
	
}

class Rect extends Shape{
	int len, width;
	
	public Rect(int x, int y){
		super("Rect");
		this.len = x;
		this.width = y;
	}
	
	public int area(){
		return len * width;
	}
	
}

abstract class Circle extends Shape{
	int radius;
	
	public Circle(int x){
		super("Circle");
		this.radius = x;
	}
	public void testing(){
		System.out.println("testing");
	}
	
}

class CircleVersion2 extends Circle{
	
	CircleVersion2(int radius){
		super(radius);
		
	}

	@Override
	int area() {
		// TODO Auto-generated method stub
		return radius * radius;
	}
	
}
