package arrays;

/*
 * Given an array containing non-negative integers, and each value of the array indicating a height of the container. 
 * Find the total volume of water sthat can be stored in this container. 
 */

public class TrapRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(getWaterContent(arr));
	}
	
	public static int getWaterContent(int[] A) {
		
		int left=0; int right=A.length-1;
        int res=0;
        int maxleft=0, maxright=0;
        while(left<=right){
            if(A[left]<=A[right]){
                if(A[left]>=maxleft) maxleft=A[left];
                else res+=maxleft-A[left];
                left++;
            }
            else{
                if(A[right]>=maxright) maxright= A[right];
                else res+=maxright-A[right];
                right--;
            }
        }
        return res;
	}
}
