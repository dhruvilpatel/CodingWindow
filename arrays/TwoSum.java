package arrays;

import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
		public static void main(String args[]){
			int [] arr = {1,5,6,2,8,2,8,2,4}; 
			findPair(arr,10);
			System.out.println("__________For Loop___________________________________");
			findThePairs(arr,10);
			System.out.println("___________Sorting___________________________");
			findPairBySort(arr,10);
			System.out.println("dhruvil".substring(1));
			
		}
		
		// Complexity O(n)
		public static void findPair(int[] input,int k){
			
			// 1st Solution
//			HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
//			for (int i=0; i<arr.length ;i++)
//			{
//			  hash.put(arr[i], i); // key is the element and value is its index.
//			}
//			 
//			for (int i=0; i<arr.length; i++)
//			{
//				
//			  if (hash.containsKey(sum-arr[i]) && hash.get((sum - arr[i])) != i ){ // if T - ele exists and is different we found a pair
//			    System.out.println(arr[i] + " " +  arr[hash.get(sum-arr[i])]); 
//			   
//			  }
//				
//			}
			
			// 2nd Solution - Wont handle duplicate data - Time Complexity - O(n) and Space Complexity - O(n)
//			HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
	//
//		    for(int i=0;i<input.length;i++){
	//
//		        if(pairs.containsKey(input[i])){
//		            System.out.println(input[i] +", "+ pairs.get(input[i]));
//		            pairs.put(k-input[i], input[i]);
//		        }else
//		            pairs.put(k-input[i], input[i]);
//		    }
			
			// 5th Solution - can handle duplicate - Time Complexity - O(n) and Space Complexity - O(n)
			HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		    HashMap<Integer, Integer> keyFreq = new HashMap<Integer, Integer>();

		    for(int i=0;i<input.length;i++){

		      if(pairs.containsKey(input[i])) {
		        for(int count = 0; count < keyFreq.get(pairs.get(input[i])); count++){
		            System.out.println(input[i] +", "+ pairs.get(input[i]));
		        }
		      }
		      
		      if(keyFreq.containsKey(input[i])) {
		      	keyFreq.put(input[i], keyFreq.get(input[i]) + 1);
		      } else {
			      keyFreq.put(input[i], 1);
		      }
		      
		      pairs.put(k-input[i], input[i]);
		    }
			
			// 3rd solution 
	//HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//			
//			for(int i = 0 ; i < att.length ; i++){
//				
//				hm.put(att[i], i);
//				
//			}
//			
//			int count = 0;
//			for(int c : att){
//				
//				if(hm.containsKey(sum - att[count]) && hm.get(sum - att[count]) != count){
//					System.out.println("Integer1:"+ att[count] + " Integer 2 : " + (sum - att[count]));
//				}
//				count++;
//			}
		    
		    // 4th solution
		    
//			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//			
//			for(int i = 0 ; i < att.length ; i++){
//				int temp = sum - att[i];
//				hm.put(temp,att[i]);
//				
//			}
//			
//			int count = 0;
//			for(int c : att){
//				
//				if(hm.containsKey(att[count])){
//					System.out.println("Integer1:"+ att[count] + " Integer 2 : " + hm.get(att[count]));
//				}
//				count++;
//			}
			
			
		}
		
		// Complexity O(nlogn) - Time Complexity - O(nlogn) and Space Complexity - O(1)
		public static void findPairBySort(int[] arr, int sum){
		
			// Assuming sort algo is in-place
			Arrays.sort(arr);
			int start= 0 , end = arr.length - 1;
			while( start < end ){
				
				if(arr[start] + arr[end] == sum){
					System.out.println("Integer1:"+ arr[start] + " Integer 2 : " + arr[end]);
					start++;
					end--;
				}
				else if(arr[start] + arr[end] > sum){
					end--;
				}
				else{
					start++;
				}
				
			}
			
		}
		
		// Complexity O(n^2) - Time Complexity - O(n^2) and Space Complexity - O(1)
		static void findThePairs(int inputArray[], int inputNumber)
	    {
	        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
	 
	        for (int i = 0; i < inputArray.length; i++)
	        {
	            for (int j = i+1; j < inputArray.length; j++)
	            {
	                if(inputArray[i]+inputArray[j] == inputNumber)
	                {
	                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
	                }
	            }
	        }
	    }
	
}
