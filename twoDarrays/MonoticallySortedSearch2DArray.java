package twoDarrays;
public class MonoticallySortedSearch2DArray {

	public static void main(String args[]){
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(Search(arr, 111));
		
	}
	
	static boolean Search(int[][] arr, int element){
		
		int r = 0 ; int c = arr[0].length - 1;
		
		while( r <= arr.length - 1 && c >= 0){
			if(arr[r][c] == element) return true;
			
			else if(arr[r][c]> element) c--;
			else r++;
			
		}
		
		return false;
	}
	
}