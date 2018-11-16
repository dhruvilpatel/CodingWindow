package simple;

public class IntegerCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getIntegerComplement(5));
	}
    static int getIntegerComplement(int n) {
        /*
         * Write your code here.
         */
        int bits = (int) Math.floor( Math.log(n) / Math.log(2)) + 1;
        
        return ((1 << bits) - 1) ^ n;
    }
    
   
}
