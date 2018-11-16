package simple;

public class MathsLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mathConvert("MMMG"));
	}
	 static int mathConvert(String mesopotamianValue) {
	        /*
	         * Write your code here.
	         */
	        char[] values = mesopotamianValue.toCharArray();
	        
	        int prev = getValues(values[0]);
	        int next = getValues(values[1]);
	        
	        int result = prev;
	       
	        for(int i = 1 ; i < values.length; i++) {
	        	next = getValues(values[i]);
	        	if(next > prev) result += next - (2 * prev);
	        	else result += next;
	        	
	        	prev = next;
	        	
	        }
	        
	        
	    return result;
	    }
	    static int getValues(char value){
	        switch(value){
	            case 'A':
	                return 1;
	            case 'M':
	                return 4;
	            case 'C':
	                return 8;
	            case 'G':
	                return 25;
	            case 'R':
	                return 100;
	        }
	        return 0;
	    }
}
