package arrays;
public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,5,5,5};
		int[] arr2 = {2, 2, 3,5,5,7};
	intersection(arr1,arr2);
	}
	
	static void intersection(int[] arr1, int[] arr2){
		int  i = 0, j = 0;
		
		while(arr1.length > i && arr2.length > j){
			
			if(arr1[i] == arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}else if(arr1[i] > arr2[j]) j++;
			else i++;
			
			
		}
	}

}
