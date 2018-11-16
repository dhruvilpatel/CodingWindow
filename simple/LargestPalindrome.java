package simple;

public class LargestPalindrome {
	public static void main(String[] args){
        // The largest number that can be formed by multiplication of two 3 digit number is 998001
        int maxPalindrome = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 999 ; i > 100; i--){
        
            for(int j = 999; j > 100 ; j--){
                int multiply = i*j;
                if(multiply > maxPalindrome && isPalindrome(multiply)){
                    maxPalindrome = multiply;
                    num1 = i;
                    num2 = j;
                }
            }
        
        }
        System.out.println("The largest palindrome is "+ maxPalindrome + " formed by multiplying two 3 digits numbers: " + num1 + " and " + num2);
    }
    
    public static boolean isPalindrome(int num){
        int reversed = 0;
        int original = num;
        while(num > 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        return reversed == original; 
    }
}
