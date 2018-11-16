package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,2};
        int target = 8;
        ArrayList<ArrayList<Integer>> output = fourSum(nums, target);
        for(List<Integer> inner: output) {
        	for(int number: inner) {
        		System.out.print(number + ", ");
        	}
        	System.out.println();
        }
	}
	
	static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length - 3; i++) {
			
			for (int j = i+1; j < arr.length - 2; j++) {
				int m = j + 1;
				int n = arr.length - 1;
				
				while(m < n) {
					if(arr[i] + arr[j] + arr[m] + arr[n] < target) {
						m++;
					}
					else if(arr[i] + arr[j] + arr[m] + arr[n] > target) {
						n--;
					}else {
						ArrayList<Integer> inner = new ArrayList<Integer>();
						inner.add(arr[i]);
						inner.add(arr[j]);
						inner.add(arr[m]);
						inner.add(arr[n]);
						result.add(inner);
						m++;
						n--;
					}
				}
			}
		}
		return result;
	}
	
}
