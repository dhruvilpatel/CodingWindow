package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class JobOffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {4,8,7};
		int[] uL= {8,4};
		int[] lL = {2, 4};
		
		int[] a = jobOffers(scores, lL, uL);
		
		for(int x: a) {
			System.out.println(x);
		}
	}	
	
	
		static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
			int[] answer = new int[lowerLimits.length];
			
			Arrays.sort(scores);
			
			HashMap<Integer, Integer> scoresHM = new HashMap<Integer, Integer>();
			for(int i = 0 ; i < scores.length; i++) {
				if(!scoresHM.containsKey(scores[i])) {
					scoresHM.put(scores[i], i);
				}
			}
			
			for( int j = 0; j < lowerLimits.length; j++) {
				int start = 0;
				if(scoresHM.containsKey(lowerLimits[j])) {
					start = scoresHM.get(lowerLimits[j]);
				}else {
					int lower = lowerLimits[j] + 1;
					while(!scoresHM.containsKey(lower)) {
						lower++;
					}
					
					start = scoresHM.get(lower);
				}
				
				int end = 0;
				if(scoresHM.containsKey(upperLimits[j])) {
					end = scoresHM.get(upperLimits[j]);
				}else {
					int upper = upperLimits[j] - 1;
					while(!scoresHM.containsKey(upper)) {
						upper--;
					}
					
					end = scoresHM.get(upper);
				}
				
				answer[j] = end - start + 1;
			}
			
			return answer;
		}
//			
//			if(scores.length < 1) return new int[0];
//			Arrays.sort(scores);
//			int[] answer = new int[lowerLimits.length];
//			for( int j = 0; j < lowerLimits.length; j++) {
//				int start=0, end = scores.length - 1;
//					while(lowerLimits[j]> scores[start]) {
//						start++;
//					}
//					while(upperLimits[j] < scores[end]) {
//						end--;
//					}
//				
//				answer[j] = end - start + 1;
//				
//			}
//			return answer;
//		}
		
		static int[] jobOffers2(int[] scores, int[] lowerLimits, int[] upperLimits) {
			
			if(scores.length < 1) return new int[0];
			int[] answer = new int[lowerLimits.length];
			
			for(int i=0; i < scores.length; i++) {
				for( int j= 0; j < lowerLimits.length; j++) {
					if(lowerLimits[j]<= scores[i] && scores[i]<=upperLimits[j])
						answer[j]++;
				}
			}
			
//			int[] answer = new int[lowerLimits.length];
//			for( int j= 0; j < lowerLimits.length; j++) {
//				int counter = 0;
//				for(int i=0; i < scores.length; i++) {
//					
//					if(lowerLimits[j]<= scores[i] && scores[i]<=upperLimits[j])
//						counter++;
//				}
//				answer[j] = counter;
//				
//			}
			return answer;
		}
		static int[] jobOffers1(int[] scores, int[] lowerLimits, int[] upperLimits) {
			
			if(scores.length < 1) return new int[0];
			Arrays.sort(scores);
			int[] answer = new int[lowerLimits.length];
			for( int j= 0; j < lowerLimits.length; j++) {
				int start=0, end = scores.length - 1;
				while(lowerLimits[j] > scores[start]) {
					start++;
				}
				while(upperLimits[j] < scores[end]) {
					end--;
				}
				answer[j] = end - start + 1;
				
			}
			return answer;
		}
}
