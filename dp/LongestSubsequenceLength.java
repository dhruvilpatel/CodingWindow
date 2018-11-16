package dp;

public class LongestSubsequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longestSubsequence("AGGTAB","GXTXAYB"));
		
	}

	public static int longestSubsequence(String s1, String s2) {
			
		int[][] mem = new int[s1.length() + 1][s2.length() + 1];
		int i, j = 0;
		for(i = 0 ; i <= s1.length(); i++) {
			for(j = 0 ; j <= s2.length(); j++) {
				
				if(i == 0 || j == 0) 
					mem[i][j] = 0;
				
				else if(s1.charAt(i - 1) == s2.charAt(j - 1))
					mem[i][j] = mem[i - 1][j - 1] + 1;
				
				else
					mem[i][j] = Math.max(mem[i - 1][j], mem[i][j - 1]);
			}
		}
		return mem[i - 1][j - 1];
	}
	
}
