package strings;

import java.util.HashMap;

public class StringTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int counter = sc.nextInt();
//		while(sc.hasNext()) {
//			String line = sc.nextLine();
//			System.out.println(stringTransformation(line));
//			sc.nextLine();
//		}
		System.out.println(stringTransformation("pzz"));
	}
	
	private static String stringTransformation(String input) {
		
		StringBuilder s = new StringBuilder();
		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		
		
		for(char c : input.toCharArray()) {
			if(counter.containsKey(c)) {
				counter.put(c, counter.get(c) + 1);
				s.append(transform(c , counter.get(c)));
			}else {
				counter.put(c,0);
				s.append(c);
			}
				
		}
		
		return s.toString();
	}
	
	static char transform(char c , int count) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int index = 0;
		for(int i = 0 ; i < alphabet.length; i++){
				if(alphabet[i] == c) {
					index = i; break;
				}
		}
		
		if(index + count >= 25 ) {
			return alphabet[index + count - 26];
		}else {
			return alphabet[index  + count];
		}
		
		
	}
	
}
