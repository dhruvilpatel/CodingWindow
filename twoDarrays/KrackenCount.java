package twoDarrays;

public class KrackenCount {

	public static void main (String args[]){
		int[][] a = { {1,2,3},{4,5,6},{7,8,9}};
		int n = 3 , m= 2;
		int[][] result = new int[m][n];
		for (int i = 0 ; i < m ; i++){
			result[i][0] = 1;
		}
		for (int i = 0 ; i < n ; i++){
			result[0][i] = 1;
		}
		for ( int i = 1 ; i < m ; i++){
			for ( int j = 1 ; j < n ; j++){
				result[i][j] = result[i][j-1] + result[i-1][j] + result[i-1][j-1];
			}

		}
		System.out.println(result[m-1][n-1]);
	}
	
}
