package arrays;

public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-7, -5, -11, -2, -44};
		System.out.println(maxDiff(arr));
		System.out.println(returnMaxDifference(arr));
	}
	
	public static int returnMaxDifference(int[] a) {
		int min = a[0];
		int max = a[0];
		int minAfterMax = a[0];
		
		for(int i = 1 ; i < a.length; i++) {
			
			if( a[i] > max) {
				max = a[i];
				min = minAfterMax;
			}
			else if(a[i] < minAfterMax) {
				minAfterMax = a[i];
			}
			
		}
		
		return max - min == 0 ? -1 : max - min;
	}
	public static int maxDiff(int a[])
	{
		int  n = a.length;
	    int maxDiff = -1; 
	 
	    int maxRight = a[n-1];
	 
	    for (int i = n-2; i >= 0; i--)
	    {
	        if (a[i] > maxRight)
	            maxRight = a[i];
	        else
	        {
	            int diff = maxRight - a[i];
	            if (diff > maxDiff)
	            {
	                maxDiff = diff;
	            }
	        }
	    }
	    return maxDiff;
	}
	 public static int max(int x, int y) 
	    {
	        return x > y ? x : y;
	    }
	 
	    public static int min(int x, int y) 
	    {
	        return x < y ? x : y;
	    }
}
