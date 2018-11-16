package arrays;

public class CalculateSumMaxWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// Calculate sum for two given array 
	// Max sum is winner
	public static void Winner(int[] arr1, int[] arr2) {
		int total1 = 0, total2 = 0;
		for(Integer i : arr1) {
			total1 += i;
		}
		
		for(Integer i : arr2) {
			total2 += i;
		}
		
		if(total1 == total2) System.out.println("TIE");
		else if(total1 > total2) System.out.println("GUNAR");
		else System.out.println("EMMA");
	}
	
	
}
