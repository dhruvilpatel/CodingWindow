package simple;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printFibonacciSeries(10);
//		System.out.println(Fibonacci());
//		System.out.println(reverseFibonacci(5));
		System.out.println(memFibonacci(5));
	}
	
	
	public static void printFibonacciSeries(int num) {
		
		int i = 0; 
		int j = 1;
		while(num > 0) {
			int tmp = i;
			i = i + j;
			System.out.println(i);
			j = tmp;
			num--;
		}
//		while(num > 0) {
////		int tmp = a;
//			int c = a + b;
//			System.out.println(c);
//			a = b;
//			b = c;
//			num--;
//		}
		
	}
	
	
	public int getFibonacciRecurse() {
		return -1;
	}
	
	
	public static int reverseFibonacci(int num) {
		if( num == 0) return 0;
		if( num <= 2) return 1;
		return reverseFibonacci(num-1) + reverseFibonacci(num -2);
	}
	
	static int[] memory = new int[21] ;
	public static int memFibonacci(int num) {
		
		if(num == 0) { 
			memory[num] = 0;
			return memory[num];
		}
		if(num <= 2) { 
			memory[num] = 1;
			return memory[num];
		}
		
		if( memory[num] != 0) return memory[num];
		
		memory[num] = memFibonacci(num - 1) + memFibonacci(num - 2);
		return memory[num];
	}
public static long Fibonacci(){
        
        int i = 1;
        int j = 1;
        int counter = 0;
        long sum = 0;
        while(counter<100){
            int tmp = i;
            i = i + j;
            j = tmp;
            if(i%2 == 0){
                counter++;
                sum+=i;
            }
        }
        return sum;
    }

}
