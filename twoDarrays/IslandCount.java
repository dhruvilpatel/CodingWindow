package twoDarrays;

//tripadvisor
public class IslandCount {
	public static void main (String args[]){
		
		int[][] matrix = {{1,0,0,1,0},
						  {0,0,0,0,1},
						  {1,1,0,0,0},
						  {0,0,0,0,0}};
		
		int ans = numIslands(matrix);
		System.out.println(Integer.toString(ans));
		
		
	}
	public static int numIslands(int[][] venue) {
	    if(venue==null || venue.length==0||venue[0].length==0)
	        return 0;
	 
	    int m = venue.length;
	    int n = venue[0].length;
	 
	    int count=0;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(venue[i][j]==1){
	                count++;
	                merge(venue, i, j);
	            }
	        }
	    }
	 
	    return count;
	}
	 
	public static void merge(int[][] grid, int i, int j){
	    int m=grid.length;
	    int n=grid[0].length;
	 
	    if(i<0||i>=m||j<0||j>=n||grid[i][j]!=1)
	        return;
	 
	    grid[i][j]= 0;
	    merge(grid,i-1,j-1);
	    merge(grid,i+1,j+1);
	    merge(grid,i-1,j+1);
	    merge(grid,i+1,j-1);
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	}
}