package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindFirstNotRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findFirstNotRepeatedCharacter("Dhruvil");
		
	}
	
	public static void findFirstNotRepeatedCharacter(String s){
		
		// will return randomized character that is not repeated wont maintaing order.
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
		for(int  i = 0 ; i<s.length(); i++){
			
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i),hm.get(s.charAt(i)) + 1 );
			}
			else{
				hm.put(s.charAt(i), 1);
			}
			
		}
		
		
		for(char c : hm.keySet()){
			if(hm.containsKey(c) && hm.get(c)==1){
				System.out.println("First Non Repeated Character is using HashMap: " + c);
				break;
			}
		}
		
		// without HashMap if character order matters as it appears;
		
		HashSet<Character> hm1 = new HashSet();
		ArrayList<Character> al = new ArrayList();
		for(int  i = 0 ; i<s.length(); i++){
			// will continue once we store value in hashmap
			if(hm1.contains(s.charAt(i))){
				continue;
			}
			
			if(al.contains(s.charAt(i))){
				al.remove((Character)s.charAt(i));
				hm1.add(s.charAt(i));
			}
			else{
				al.add(s.charAt(i));
			}
			
		}
		
				if(al.size()>0)
				System.out.println("First Non Repeated Character is using ArrayList: " + al.get(0));
				
				
				
		// Find first non repeated alphabetically character 
				int[] flag = new int[256];
				
				for(int i=0; i<s.length(); i++){
					flag[s.charAt(i)]++;
				}
				for(int i=0; i<flag.length; i++){
					if(flag[i]==1) System.out.println("First Non Repeated Character Alphabatically : "+ (char)i);
				}
	}

}
