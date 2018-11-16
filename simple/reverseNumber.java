package simple;

public class reverseNumber {
	public static void main(String[] args) {
		System.out.println(isNumberPalidrome(121));
		System.out.println(reverse(-123));
	}

	public static boolean isNumberPalidrome(int n) {
		
		int divisor = 1;
		while(n/divisor >= 10) {
			divisor *= 10;
		}
		
		while(n != 0) {
			int first = n / divisor;
			int last = n % 10;
			
			if(first != last) {
				return false;
			}
			n = (n % 10 ) / 10;
			divisor = divisor / 100;
		}
		
		return true;
	}
	
public static int reverse(int x) {
        
        boolean negative = false;
        
        if(x < 0){ 
            negative = !negative;
            x *= -1;
        }
        int result = 0;
        int multiplier = 10;
        while(x != 0){
            result = result * multiplier + x%10;
            x = x / 10;
        }
        
        
        return negative ? (-1) * result : result;
        
        
    }
}
