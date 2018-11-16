package strings;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IS PAlidrome :" + isPalidrome("dhruurhd"));
		System.out.println("IS PAlidrome Recursively :" + isPalidromeRecursive("dhruurhd",0,7));
	}
public static boolean isPalidrome(String s){
		
		for(int start = 0, end = s.length()-1 ; start < end; start++, end--){
			
			if(s.charAt(start) != s.charAt(end)){
				System.out.println("Not a Palidrome");
			return false;
			}
			
		}
		return true;
		
	}
	public static boolean isPalidromeRecursive(String s, int start, int end){
		
		if( s.length() <= 1) return true;
		boolean flag;
	
		if(start>=0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
			flag = isPalidromeRecursive(s.substring(1, s.length()-1),start, end-2);
			
		}
		else{
			return false;
		}
		
		return flag;
	}

}
