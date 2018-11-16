package dp;

public class Combination {
	static int[] table =  new int[11];
	public static void main(String[] args) {
		System.out.println("A"+getCombination(10));
		
		System.out.println(countWaysDP(10, table));
//		System.out.println("m" + minValue(9, 2));
//		for(int i = table.length - 1 ; i >= 0 ; i--) {
//			if(table[i] % 2 == 0) {
//				System.out.println(table[i]);
//			}
//		}
	}

	public static int getCombination(int stairs) {

		int i = 0;
		int j = 1;
		for (int k = 0; k <= stairs; k++) {
			int temp = j;
			j += i;
			i = temp;
			

		}
		return i;
	}

	public static int countWaysDP(int n, int[] map) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (map[n] > 0) {
			return map[n];
		} else {
			map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) ;
			return map[n];
		}
	}

	
//	public static int minValue(int n, int m) {
//		int counter = 0;
//		if(m > n) return -1;
//		if((n%2 == 0 && (n/2)%m==0 )) return n/2;
//		else if(n%2 == )
//		else if(n%2!=0)
//		else return n/2 + 1;
//		while(n>0) {
//			if(n == 1 && counter+1 % m == 0) return counter++;
//			else if( n==1 && counter+2%m==0) {
//				return counter + 2;
//			}
//			counter++;
//			n = n/2;
//		}
//		return counter%m == 0 ? counter: -1;
//	}
}
