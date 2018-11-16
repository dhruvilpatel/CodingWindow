package arrays;
import java.util.Arrays;

public class smallestDifferenceBetweenTwoArrays {

	public static void main(String[] args) {
		int[] ar1 = {1,3,15,11,2};
		int[] ar2 = {23,127,235,19,8};
		System.out.println(getSmallestDifferenceNXM(ar1, ar2));
		System.out.println(getSmallestDifferenceNLOGN(ar1, ar2));
	}
	
	
	static int getSmallestDifferenceNXM(int[] arr1, int[] arr2) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr1.length; i++) {
			for( int j =0; j < arr2.length; j++) {
				if(Math.abs(arr1[i] - arr2[j]) < smallest) smallest = Math.abs(arr1[i] - arr2[j]);
			}
		}
		return smallest;
	}
	
	static int getSmallestDifferenceNLOGN(int[] arr1, int[] arr2) {
		int smallest = Integer.MAX_VALUE;
		Arrays.sort(arr1); // 1,2,3,11,15
		Arrays.sort(arr2); // 8,19,23,127,235
		
		int a = 0, b = 0;
		while(a < arr1.length && b < arr2.length) {
			
			if(Math.abs(arr1[a] - arr2[b]) < smallest) smallest = Math.abs(arr1[a] - arr2[b]);
			
			if(arr1[a] > arr2[b]) b++;
			else a++;
		}
		
		return smallest;
		
	}
	
}
