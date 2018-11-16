package arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,1,2,6,4};
		minMax(array);
	}
	
public static void minMax(int[] arr){
		
		// Assuming only positive integers
		int min = arr[0]; 
		int max = arr[0] ;
		for(int i=0 ; i<arr.length; i++){
			
			if(arr[i]>max){
				max = arr[i];
			}
			else if(arr[i] <= min){
				min = arr[i];
			}
			
		}
		System.out.println("Maximum will be :" + max + "  Minimum will be :" + min);
		
		
	}

}
