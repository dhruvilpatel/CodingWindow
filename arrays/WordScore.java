package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordScore {

	public static void main(String[] args) {
		String[] arr = { "this", "that" };
		String[] answer = sortWordsByScore(arr);
		System.out.println(answer.length);
		for(String ans: answer){
			System.out.println(ans);
		}
	}
	public static HashMap<Character, Integer> getAlphabetsMap() {
		HashMap<Character, Integer> scoresHM = new HashMap<Character, Integer>();
		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0 ; i < alphabets.length; i++) {
			if(isVovels(alphabets[i]) >= 0) {
				scoresHM.put(alphabets[i], (i + 1)*2);
			}else {
				scoresHM.put(alphabets[i], i + 1);
			}
		}
		return scoresHM;
	}
	
	
	static String[] sortWordsByScore(String[] words) {
		HashMap<Character, Integer> scoresHM =  getAlphabetsMap();
		HashMap<String, Integer> answer = new HashMap<String, Integer>();
		for(int i = 0 ; i < words.length ; i++) {
			int scores = calculateScores(words[i].toLowerCase(), scoresHM);
			answer.put(words[i], scores);
		}
		
		Map sortedMap = sortByValue(answer);
		Set<String> sortedKeySet = sortedMap.keySet();
		String[] output = sortedKeySet.toArray(new String[sortedKeySet.size()]);

		
		return output;
	}

	static int calculateScores(String s, HashMap<Character, Integer> scoresHM) {

		char[] letters = s.toCharArray();
		int count = 0;
		for (char letter : letters) {
			count += scoresHM.get(letter);
		}
		return count;
	}
	
	public static Map sortByValue(Map unsortedMap) {
		
		List mapKeys = new ArrayList(unsortedMap.keySet()); // String
        List mapValues = new ArrayList(unsortedMap.values()); // Integer
        Collections.sort(mapValues);
        Collections.sort(mapKeys);
        LinkedHashMap sortedMap = new LinkedHashMap();

        Iterator valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Object val = valueIt.next();
            Iterator keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Object key = keyIt.next();
                Integer comp1 = Integer.parseInt(unsortedMap.get(key).toString());
                Integer comp2 = Integer.parseInt(val.toString());

                if (comp1.equals(comp2)) {
                	unsortedMap.remove(key);
                    mapKeys.remove(key);
                    sortedMap.put( key, val);
                    break;
                }
            }
        }
        return sortedMap;
		
		
	}

	static int isVovels(char c) {
		return "aeiou".indexOf(c);
	}
}

