package twoDarrays;

public class GropuByAdjacentIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,0,1,0},
				  		  {0,0,0,0,1},
				  		  {1,1,1,0,0},
				  		  {0,1,0,0,0}};
			int[] arr = {2,4};
			int[] ans = countGroups(matrix, arr);
			for(int a : ans)
			System.out.println(Integer.toString(a));
	

}
	public static int[] countGroups(int[][] m, int[] t) {
		for(int i = 0 ; i < t.length; i++) {
			int [][] tmp = new int[m.length][m[0].length];
			for(int j = 0; j < m.length; j++)
			    tmp[j] = m[j].clone();
			t[i] = countGroups(tmp, t[i]);
		}
		return t;
	}

	public static int countGroups(int[][] tmp, int group) {
	    if(tmp==null || tmp.length==0 || tmp[0].length==0)
	        return 0;
	 
	    int r = tmp.length;
	    int c = tmp[0].length;
	    
	    int groupCounter = 0;
	    for(int i=0; i<r; i++){
	        for(int j=0; j<c; j++){
	            if(tmp[i][j]==1){
	                int groupValue = merge(tmp, i, j, 0);
	                if(groupValue == group) groupCounter++;
	            }
	        }
	    }
	 
	    return groupCounter;
	}
	 
	public static int merge(int[][] grid, int i, int j, int count){
	    int m=grid.length;
	    int n=grid[0].length;
	 
	    if(i<0||i>=m||j<0||j>=n||grid[i][j]!=1)
	        return 0;
	    
	    count = 1;
	    grid[i][j]= 0;
	    count += merge(grid, i-1, j, count);
	    count += merge(grid, i+1, j, count);
	    count += merge(grid, i, j-1, count);
	    count += merge(grid, i, j+1, count);
	    
	    return count;
	}
}