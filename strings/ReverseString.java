package strings;

public class ReverseString {
	
	public static void main(String args[]){
		reverse("Dhruvil is fun");
		reverseThroughArray("Dhruvil is fun");
		System.out.println("recurseReverse  :" + recurseReverse("Dhruvil is fun"));
		reverseInPlace("Dhruvil is fun");
		reveseBuilder("Dhruvil is fun");
	}
	
	public static  void reverse(String s){
		String output = "";
		
		for( int i = s.length()- 1 ; i >=0 ; i--){
			output+= s.charAt(i);
		}
		
		System.out.println("Simple Reverse : " + output);
	}
	
	public static void reverseInPlace(String s){
		StringBuilder sb = new StringBuilder(s);
		for(int start= 0 , end = s.length()-1; start<end ; start++, end-- ){
			
			char i = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, i);
			
		}
		
		System.out.println("StringBuilder In place :" + sb);
	}
	
	public static void reveseBuilder(String s){
		
		StringBuffer sb = new StringBuffer();
		
		for( int i = s.length()- 1 ; i >=0 ; i--){
			sb.append(s.charAt(i));
		}
		System.out.println("reveseBuilder : " + sb);
	}
	
	public static void reverseThroughArray(String s){
		
		char[] c = s.toCharArray();
		
		for( int i = 0, j = s.length()-1 ; i < j; i++, j--){
			
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			
		}
		String output = String.valueOf(c);
		
		
		System.out.println("reverseThroughArray : " + output);
		
		
	}
	
	public static String recurseReverse(String s){
		 String output ="";
		// Tail Recursive - its good because - don't need to store values in stack because there is no process that need to be done after recursion
		if (s.length() == 0){
			return "";
		}
		
		output += s.charAt(s.length() - 1) + recurseReverse(s.substring(0, s.length() - 1));
		
		return output;
		
		// Non tail Recursive
//		if (s.length() == 0){
//			return "";
//		}
//		
//		output += recurseReverse(s.substring(1,s.length())) +  s.charAt(0) ;
//		
//		return output;
		
	}
	
}