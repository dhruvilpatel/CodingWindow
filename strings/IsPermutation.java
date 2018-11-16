package strings;

import java.util.ArrayList;

public class IsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPermutation("Dfhruviul","rDhuflviu");
	}

	// Is same for chercking Anagram
		public static void isPermutation(String s1, String s2){
			
			// Can also do by sorting both string and comparing each character by character
			
			boolean flag = true;
			
			ArrayList hm = new ArrayList();
			
			for(int i = 0 ; i < s1.length(); i++){
				
					hm.add(s1.charAt(i));
				
			}
			for(int i = 0 ; i < s2.length(); i++){
				if(hm.contains(s2.charAt(i))){
					hm.remove((Character)s2.charAt(i));
				}
				else{
					System.out.println("Not A permutation");
				}
				
			}
			
//			HashMap hm = new HashMap();
//			
//			for(int i = 0 ; i < s1.length(); i++){
//				if(hm.containsKey(s1.charAt(i))){
//					hm.put(s1.charAt(i),hm.get(s1.charAt(i) + 1 ));
//				}
//				else{
//					hm.put(s1.charAt(i), 1);
//				}
//			}
//			for(int i = 0 ; i < s2.length(); i++){
//				if(hm.containsKey(s2.charAt(i))){
//					hm.put(s2.charAt(i),hm.get(s2.charAt(i) - 1 ));
//				}
//				else{
//					flag = false;
//				}
//			}
			
			if (hm.size()==0)
				System.out.println("Permutations");
			else
				System.out.println("Not Permutations");
			
			
			// Checking by creating ascii character array
			if (s1.length() != s2.length()) {
				System.out.println("Second Solution Not Permutation");
				}
				int[] letters = new int[256]; // Assumption
					char[] s_array = s1.toCharArray();
				for (char c : s_array) { // count number of each char in s.
				 letters[c]++;
				 }
				
				 for (int i = 0; i < s2.length(); i++) {
				 int c = (int) s2.charAt(i);
				 if (--letters[c] < 0) {
				 System.out.println(" Second Solution Not Permutation");
				 }
				 }
				 
				 
			
		}
}
