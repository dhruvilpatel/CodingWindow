package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPalidrome {
	static boolean isPalindrome(int n)
    {   
        // Find the appropriate divisor
        // to extract the leading digit
        int divisor = 1;
        while (n / divisor >= 10)
            divisor *= 10;
      
        while (n != 0)
        {
            int leading = n / divisor; 
            int trailing = n % 10;
      
            // If first and last digit 
            // not same return false
            if (leading != trailing)  
                return false;
      
            // Removing the leading and trailing
            // digit from number
            n = (n % divisor) / 10;
      
            // Reducing divisor by a factor 
            // of 2 as 2 digits are dropped
            divisor = divisor / 100;
        }
        return true;
    }
      
    // Driver code
    public static void main(String args[])
    {
        if(isPalindrome(101))
            System.out.println("Yes, it is Palindrome");
        else
            System.out.println("No, not Palindrome");
        
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> output = fourSum(nums, target);
        for(List<Integer> inner: output) {
        	for(int number: inner) {
        		System.out.print(number + ", ");
        	}
        	System.out.println();
        }
        
        System.out.println(getSecondLastWord("  Hey there how are you doin!  "));
    } 
    
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
     
        if(nums==null|| nums.length<4)
            return result;
     
        Arrays.sort(nums);
     
        for(int i=0; i<nums.length-3; i++){
    
            for(int j=i+1; j<nums.length-2; j++){
                
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                        k++;
                    }else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                        l--;
                    }else{
                        List<Integer> t = new ArrayList<Integer>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        result.add(t);
     
                        k++;
                        l--;
     
                        while(k<l &&nums[l]==nums[l+1] ){
                            l--;
                        }
     
                        while(k<l &&nums[k]==nums[k-1]){
                            k++;
                        }
                    }
     
     
                }
            }
        }
     
        return result;
    }
    static String getSecondLastWord(String s) {
    	
    	String input = s.trim();
    	if(input.isEmpty()) return "";
    	
    	String[] inputArr = input.split(" ");
    	
    	return inputArr.length > 1 ? inputArr[inputArr.length - 2] : "";
    	
    }
}
