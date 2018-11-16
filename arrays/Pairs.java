package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Pairs {

	public static void main(String[] args) {
		System.out.println("Dhruvil".substring(4,7));
		String s = "aaaa";
		
		List<Integer> queries = new ArrayList();
		queries.add(0);
		queries.add(1);
		queries.add(2);
		queries.add(3);
        char[] cArray = s.toCharArray();
       
        
        for(int query : queries){
            char c = cArray[query];
            int backward = query - 1;
            int forward = query + 1;
            int res = -1;
            while(backward >= 0 && forward < s.length()){
                if(cArray[backward] == c) {
                    res = backward;
                    System.out.println("First: " + res);
                }
                else if(cArray[forward] == c) {
                    res = forward;
                    System.out.println("Second: " + res);
                }
                forward++;
                backward--;
            }
            while(backward>=0 && res == -1){
                if(cArray[backward] == c) {
                    res = backward;
                    System.out.println("Third: "+ res);
                }
                backward--;
            }
            while(forward < s.length() && res == -1){
                if(cArray[forward] == c) {
                    res = forward;
                    System.out.println("Fourth: " + res);
                }
                forward++;
            }
        }
    
		
		
//		List<Integer> a = new ArrayList<Integer>();
//		a.add(30);
//		a.add(20);
//		a.add(150);
//		a.add(100);
//		a.add(40);
//		System.out.println("Dhruvil" * 2);
////		System.out.println(playlist(a));
//		
//		Integer[][] arr = {{2,2,2, null},
//							{5,null,5,null},
//							{3,3,5,null},
//							{null,7,5,null}};
//		
//		for(int y = 0 ; y < 3; y++) {
//			for(int x = 0; x < 3; x++) {
//				if(arr[x+1][y] != null) {
//					if(arr[x+1][y] == arr[x][y]) {
//						arr[x][y] = arr[x][y] * 2;
//						arr[x+1][y] = null;
//					}
//					if(arr[x][y] == null) {
//						arr[x][y] = arr[x+1][y];
//						arr[x+1][y] = null;
//					}
//				}
//			}
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j=0; j < 4; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println("");
//		}
//	}
//	
//	static long playlist(List<Integer> songs) {
//        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
//        long answer=0;
//        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
//        
//        for(int i : songs) {
//        	if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
//        	else freq.put(i, 1);
//        }
//        
//        HashSet<String> set = new HashSet<String>();
//        for(int i = 0; i < songs.size(); i++){
//        	int difference = 60 * ((songs.get(i) / 60) + 1) - songs.get(i);
//        	String temp = "";
//        	if(difference > songs.get(i)) 
//        		temp = difference + "-" + songs.get(i);
//        	else
//        		temp = songs.get(i) + "-" + difference;
//            if(freq.containsKey(difference) && freq.get(difference) > 1 && !set.contains(temp)){
//                answer++;
//                set.add(temp);
//            }
//            
//        }
//        return answer;
    }
}
