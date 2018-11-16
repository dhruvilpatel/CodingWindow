package strings;

import java.util.ArrayList;

public class ContainsAllUnique {

	public static void main(String[] args) {
		containsAllUniqueCharacterORNot("Dhruvil");
	}
	
	public static void containsAllUniqueCharacterORNot(String s){
		// We can ask if the string is ascii and unicode
		// depending on that we know that if string is greater that that it will containg duplicates character
		// for eg ascii has 256 character so if string length is greater that that it will have duplicates character
		ArrayList hm = new ArrayList();
		boolean flag = true;
		
		for(int i=0; i<s.length(); i++){
			if(hm.contains(s.charAt(i))){
				flag = false;
				break;
			}else{
				hm.add(s.charAt(i));
			}
		}
		if (flag)
		System.out.println("String contains All Unique Character");
		else
			System.out.println("String contains Duplicated Character");

		
	}
	
}
