package arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,1,2,6,4};
		equilibriumPoint(array);
		equilibriumPointAlternative(array);
	}
	
	public static void equilibriumPoint(int[] arr){

		int sum = 0;
		
		for(int i=0 ; i <arr.length; i++){
			sum+= arr[i];
		}
		
		int leftCount = 0; 
		
		for(int i = 0 ; i < arr.length; i++){
			
			sum -= arr[i];
			
			if(leftCount == sum){
				System.out.println("Index is :" + i + "  with value " + leftCount);
				break;
			}
			leftCount += arr[i];
//			if(leftCount == sum){
//				System.out.println("Index is :" + i + "  with value " + leftCount);
//				break;
//			}
			
		}
		

}
	public static void equilibriumPointAlternative(int[] arr) {
		int leftSum = arr[0];
		int rightSum = arr[arr.length-1];
		int start = 0 ,end = arr.length - 1;
		while( start - end <= 1){
			
			if(leftSum>rightSum){
				end--;
				rightSum+=arr[end];
			}else if(rightSum>leftSum){
				start++;
				leftSum+=arr[start];
			}
			else {
				start++;
				end--;
				rightSum+=arr[end];
				leftSum+=arr[start];
				
			}
				if(start-end<=1 && leftSum ==rightSum){
				System.out.println("Equilibrium: " + end);
			}
			
			
		}
	}
}
