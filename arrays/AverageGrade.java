package arrays;

import java.util.HashMap;

// Goldman Sachs
public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] scores = {{"Dhruvil","96"},{"Tejas", "94"},{"Dhruvil","-99"},{"Nehal", "80"}};
		System.out.println(calculateMaxAverageGrade(scores));
	}

	static int calculateMaxAverageGrade(String[][] scores){
		int max = 0;
		int len = scores.length;
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < len; i++){
			String name = scores[i][0];
			int value = Integer.parseInt(scores[i][1]);
			if(dict.containsKey(name)){
				dict.put(name, dict.get(name) + value);
				count.put(name, count.get(name) + 1);
				
			}
			else{
				dict.put(name, value);
				count.put(name, 1);
			}
			
		}
		
		for(String s : dict.keySet()){
			
			int score = dict.get(s);
			int occurence = count.get(s);
			
			if(score/occurence > max) max = score/occurence;
			
		}
		
		return max;
	}
	
}
