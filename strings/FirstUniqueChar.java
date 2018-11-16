package strings;

import java.util.LinkedHashMap;

// Goldman Sachs
public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNonRepeatedChar("reverse"));
			
	}
	
	static String FirstNonRepeatedChar(String input){
		if(input.isEmpty()) return "";
		
		LinkedHashMap<Character, Integer> tracker = new LinkedHashMap<Character, Integer>();
		
		for( char c : input.toCharArray()){
			
			if(tracker.containsKey(c)) tracker.put(c ,tracker.get(c) + 1);
			else tracker.put(c, 1);
		}
		
		for(Character c : tracker.keySet()){
			if(tracker.get(c) == 1) return Character.toString(c);
		}
		return "";
	}
	

}
