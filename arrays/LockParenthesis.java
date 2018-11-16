package arrays;

// PureStorage
import java.text.ParseException;
import java.util.Scanner;
import java.util.Stack;
public class LockParenthesis {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner("25dgffdgHello123").useDelimiter("[^0-9]+");
		int integer = in.nextInt();
System.out.println(integer);
System.out.println(in.nextInt());

	String[] arr = {"ACQUIRE96", "RELEASE96", "ACQUIRE126",  "ACQUIRE1226"};
	System.out.println(isValid(arr));
	}
	
	
	static int isValid(String[] arr){
		Stack st = new Stack();
		if(arr.length < 1) return 0;
		for( int i = 0 ; i < arr.length; i++){
			Scanner in = new Scanner(arr[i]).useDelimiter("[^0-9]+");
			int integer = in.nextInt();
			if (arr[i].contains("ACQUIRE")){
				st.push("RELEASE" + integer);
			}
			else if(!st.isEmpty() && ((String) st.peek()).contains(Integer.toString(integer))){
				st.pop();
			}else{
				return i;
			}
		}
		
		
		return (int) (st.isEmpty()? 0 : arr.length+1);
	}

}
