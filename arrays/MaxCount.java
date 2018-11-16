package arrays;

import java.util.Arrays;

public class MaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {1,4,2,4};
		int[] n = {3,5};
		counts(m,n);
	}

static int[] counts(int[] nums, int[] maxes) {
        
        
	Arrays.sort(nums);
        int[] answer = new int[maxes.length];
        for(int j = 0 ; j < maxes.length; j++){
            
            answer[j] = binarySearch(nums, maxes[j]);
        }
        return answer;
    }

    static int binarySearch(int[] arr, int max){
        int high = arr.length - 1;
        int low = 0;
        int mid = (high+low) /2;
        while(low<high){ 
    
        if(arr[mid]>max){
            high = mid -1 ;
        }else if(arr[mid]< max){
            low = mid + 1;
        }
        else{
                return mid;
            }
        }
        return mid;
    }
}
