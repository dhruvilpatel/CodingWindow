package javaOop;


public class GenericClass<T> {
	
	private T value;
	
	 GenericClass(T value){
		this.value = value;
	}
	 
	 void print(){
		 System.out.println(value);
	 }
	 
	 T get(){
		 return value;
	 }

	 public static void main(String[] args){
		 
		 GenericClass str = new GenericClass("String");
		 str.print();
		 System.out.println(str.get());
		 
		 GenericClass integ = new GenericClass(5);
		 integ.print();
		 System.out.println(integ.get());
		 
		 GenericClass ch = new GenericClass('D');
		 ch.print();
		 System.out.println(ch.get());
		 
	 }
	 
}