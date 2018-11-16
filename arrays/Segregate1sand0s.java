package arrays;

public class Segregate1sand0s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {0, 0, 0, 1, 0, 0, 1, 1, 1, 1} ;
			segregateArray(arr);
			
			for(int x: arr) {
				System.out.print(x + ", ");
			}
			System.out.println();
			swapWithoutTemp(5, 9);
			
	} 
	public static int[]  segregateArray(int[] arr) {
		
		int start = 0 ; int end = arr.length -1;
		while(start < end) {
			while(arr[start] == 0) {
				start++;
			}
			while(arr[end] == 1) {
				end--;
			}
			swap(arr, start, end);
			
		}
		swap(arr, start, end);
		return arr;
	}
	public static void swap( int[] arr , int x  , int y) {
		
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
		
	}
	public static void swapWithoutTemp(int x, int y) {
		System.out.println("Before Swap: x: " + x + " and y: "+ y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap: x: " + x + " and y: "+ y);
	}
}
