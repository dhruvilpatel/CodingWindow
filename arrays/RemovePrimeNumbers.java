package arrays;

// Trip advisor
public class RemovePrimeNumbers {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 11, 15, 10, 17, 18, 19 };

		for (int i = 0; i < arr.length; i++) {

			if(!isPrime(arr[i])){
				arr[i] = 0;
			}
			
		}

		for(int i = 0; i < arr.length; i++){
			System.out.println(String.valueOf(arr[i]));
		}
	}
	
	public static boolean isPrime(int num){
		
		if(num == 1 || num == 2 || num == 3) return true;
		
		if(num % 2 == 0) return false;
		
		for(int i = 3 ; i < sqrt(num); i+=2){
			if((num % i) == 0) {
			return false; 
			}
			
		}
		
		return true;
	}
	
	public static double sqrt(int number) {
		if (number == 1) return 1;
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
}
