package arrays;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oddEvenArray = {2,5,7,8,1,6,9,1,6};
		oddEven(oddEvenArray);
	}
	
	public static void oddEven(int[] arr){
		
		int oddPos = 1, evenPos = 0;
		int len = arr.length - 1;
		
		while(oddPos < len && evenPos < len){
		
		while(evenPos<len && arr[evenPos]%2 == 0){
			evenPos +=2 ;
		}
		while(oddPos<len && arr[oddPos]%2 == 1){
			oddPos +=2 ;
		}
		// swap without using temporary
		// a  = 4 , b = 5
		// int a = a + b ; a = 9
		// int b = a - b; b = 4 
		// int a = a - b; a = 5
		if(oddPos<len && evenPos < len){
			int temp = arr[evenPos];
			arr[evenPos] = arr[oddPos];
			arr[oddPos] = temp;
		}
		else{
			break;
		}
		}
		System.out.println("Odd Even : " + Arrays.toString(arr));
		
	}

}
