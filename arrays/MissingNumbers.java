package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,7,2,3,9,5,4,6,0};
		System.out.println(getMissingNumber(arr1));
		Integer[] arr = {1,7,2,3,5,4,6,0};
		System.out.println(missingNumber(arr));
		System.out.println(getMissingNumber(Arrays.asList(arr), 5));
		System.out.println(getMissedNumber(arr));
	}
	
	// O(nlogn)
	public static int getMissingNumber(Integer[] arr) {
		
		Arrays.sort(arr);
		
		int i; 
		for(i = 0 ; i < arr.length; i++) {
			if(i != arr[i]) return i;
		}
		
		return i;
	}
	
	// O(n)
	public static int missingNumber(Integer[] arr) {
		
		int total = 0;
		
		for(int i = 0 ; i < arr.length + 1 ; i++) {
			total += i;
		}
		
		for(int num : arr) {
			total -= num;
		}
		
		return total;
	}
	
	// O(n)
	public static ArrayList<Integer> getMissingNumber(List<Integer> ls, int k){
		
		ArrayList<Integer> missingNumber = new ArrayList<Integer>(ls.size());
		HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
		
		for(Integer num : ls) check.put(num, 1);
		int i;
		for(i = 0; i <= ls.size(); i++) {
			if(!check.containsKey(i) && k>0) {
				k--;
				missingNumber.add(i);
			}
		}
		while( k > 0) {
			k--;
			missingNumber.add(i);
			i++;
		}
		return missingNumber;
	}
	
	// It need array in sorted form
	public static int getMissedNumber(Integer[] arr) {
		Arrays.sort(arr);
		int start = 0 ;
		int end = arr.length -1;
		
		
		while(start < end) {
			
			int mid = (start + end) /2;
			
			if(arr[mid] - arr[start] == mid - start) {
				if( mid+1< arr.length && arr[mid]+1 != arr[mid + 1] )
					return arr[mid] + 1;
				else
					start = mid + 1;
				
			}else {
				if(mid - 1 > -1 && arr[mid] - 1 != arr[mid - 1]) 
					return arr[mid] - 1;
				else
					end = mid - 1;
			}
			
			
		}
		return arr[end] + 1;
	}
	
}
