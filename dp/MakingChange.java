package dp;

import java.util.Arrays;

import org.omg.CORBA.INTERNAL;

public class MakingChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {9, 6, 5, 1};
	     int m = coins.length;
	     int V = 11;
	     System.out.println ( "Minimum coins required is "
	                         + getMinimumcoins(V, coins));
	}
	
	public static int getMinimumcoins(int amount, int[] coins) {
		
		int[] table = new int[amount + 1]; 
		
		table[0] = 0;
		for(int i = 1; i <= amount ; i++) table[i] = Integer.MAX_VALUE;
//		Arrays.fill(table, Integer.MAX_VALUE);
		for(int i= 1; i <= amount; i++) {
			for(int j = 0 ; j < coins.length; j++) {
				if(coins[j] <= i) {
					int sub_result = table[i - coins[j]] + 1;
					if(sub_result < table[i]) table[i] = sub_result;
				}
			}
		}
		return table[amount];
	}

}
