package strings;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
	
	public static void main(String[] args) {
		System.out.println("ababcdefahijklab".substring(0, 1));
		System.out.println(getLongestSubstring("stackoverflow"));
		System.out.println(lengthOfLongestSubstring("stackoverflow"));
		longestUniformSubstring("abbbbb");
	}
	
	
	public static String getLongestSubstring(String s){
		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		
		char[] cV = s.toCharArray();
		String output = "";
		String sofar = "";
		int startI = 0;
		int endI = 0;
		int  i = 0;
		for(char c : cV) {
			sofar += c;
			if(values.containsKey(c)) {
				int index = sofar.indexOf(String.valueOf(c));
				sofar = sofar.substring(index + 1, sofar.length());
				startI = index + 1;
			}
			
			values.put(c, i);
			if(sofar.length() >= output.length()) {
				endI = i;
				output = sofar;
			}
			i++;
		}
		System.out.println("s" + startI);
		System.out.println("e"+endI);

		return output.toString();
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	 
	 public static void longestUniformSubstring(String input) {
		 // abbbbb
		 char[] iA = input.toCharArray();
		 char prev = iA[0];
		 int startI = 0;
		 int endI = 0;
		 int startSoFar = 0;
		 int endSoFar =0 ;
		 int maxSoFar = 0;
		 for(int i = 1 ; i < iA.length; i++) {
			 if(prev == iA[i]) {
				 endI++;
			 }else {
				 if(endI - startI > maxSoFar) {
					 maxSoFar = endI-startI;
					 startSoFar = startI;
					 endSoFar = endI;
				 }
				 prev =iA[i];
				 startI = i;
				 endI = i;
				 
			 }
			 
		 }
		 
		 if(endI - startI > maxSoFar) {
			 maxSoFar = endI-startI;
			 startSoFar = startI;
			 endSoFar = endI;
		 }
		 System.out.println("s:"+startSoFar);
		 System.out.println("e:"+endSoFar);
	 }
}
