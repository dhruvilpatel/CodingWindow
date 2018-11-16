package arrays;

import java.util.Arrays;

// Calculate count of square values possible for given range 
public class CalculateSquareValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] arr = {"2 25"};
			System.out.println(Arrays.toString(getMinimumUniqueSum(arr)));
	}
	static int[] getMinimumUniqueSum(String[] arr) {
        /*
         * Write your code here.
         */ 
        
        
        
        
        
String[] input = arr[0].split(" ");
        int start= Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int cnt = 0; // Initialize result
 
       for(int i = 1 ; i < Math.sqrt(end); i++) {
    	   if(start <= i*i &&  i*i <= end) cnt++;
       }
       int [] ans = {cnt};
        
        return ans;
}

}