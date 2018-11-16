package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3};
		
		//convert int array to list
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		// convert int array to Integer Array
		Integer[] big = Arrays.stream(arr).boxed().toArray(Integer[]:: new);
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Dhruvil", 2);
		map.put("tejas", 200);
		map.put("Nehal", 50);
		
		// Sorted by Value - ascending order
		Map<String, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, 
				Map.Entry :: getValue, (e1, e2) -> e2, LinkedHashMap::new));
		
		System.out.println("map after sorting by values in descending order:" + sorted);
		
		// Sorted by value - descending order
		
		Map<String, Integer> desSorted =  map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e2, LinkedHashMap:: new ));
	
		System.out.println("map after sorting by values in descending order:" + desSorted);
		
		
		// simple java 7 code to sort Hashmap by value using comparator
		
		Set<Entry<String, Integer>> set =  map.entrySet();
		
		List<Entry<String, Integer>> al = new ArrayList<Entry<String, Integer>>(set);
		
		Collections.sort(al, new Comparator<Entry<String, Integer>>(){
			
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
				
			}
		
		});
		System.out.println("java 7 Sorting method:" + al);
		
		
		// sort 2d array
		int[][] ar = {{1,2},{6,4},{3,5}};
		
		// java 8 
		Arrays.sort(ar, (a, b) -> Integer.compare(a[1], b[1]));
		System.out.println(Arrays.deepToString(ar));
		
		// simple java 7
		Arrays.sort(ar, new Comparator<int[]>() {
			public int compare(int[] a, int b[]) {
				return Integer.compare(a[0], b[0]);
			}
		});
		System.out.println(Arrays.deepToString(ar));
		
		String[] str = {"tejas","dhruvil", "patel", "nehal"};
		// simples sort will sort alphabetically
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println(Arrays.toString(str));
	
		
		//String sort by length
		// java 8 
		Arrays.sort(str, Comparator.comparing(String::length));
		System.out.println(Arrays.toString(str));
		
		// java 7
		Arrays.sort(str, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) return -1;
				else if(s2.length() > s1.length()) return 1;
				else return 0;
			}
		});
		
		System.out.println(Arrays.toString(str));
//		int[][] aa = {{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};
//		System.out.println(Arrays.deepToString(reconstructQueue(aa)));
	}
	
//	 public static int[][] reconstructQueue(int[][] people) {
//	        
//	        if(people.length == 0 || people[0].length == 0) return new int[0][0];
//	        
//	        Arrays.sort(people, new Comparator<int[]>(){
//	            
//	            public int compare(int[] a, int[] b){
//	            	int out = Integer.compare(b[0],a[0]);
//	            	return out == 0 ? Integer.compare(a[1], b[1]) : out;
//	            }
//	            
//	        });
//	        System.out.println(Arrays.deepToString(people));
//	        
//	       List<int[]> res = new ArrayList<>(50);
//	        for (int[] p : people) {
//	            System.out.print(Arrays.toString(p) + p[1]);
//	            res.add(p[1], p);
//	        }
//	        return res.toArray(new int[0][0]);
//	    }

}
