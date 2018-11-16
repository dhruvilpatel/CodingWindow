package arrays;

public class DivideEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {13,10,21,20};
		System.out.println(moves(a));
	}
	static int moves(int[] a) {
        /*
         * Write your code here.
         */
        int size = a.length;
        int counter = 0;
        
        for(int start = 0, end = size - 1; start < end; start++, end--){
            
            while(a[start] % 2 == 0 && start < end) start++;
            
            while(a[end] % 2 != 0 && start < end) end--;
            
            if(start< end) {
            	swap(a, start, end);
            	counter++;
            }
        }
    return counter;
    }

    static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
