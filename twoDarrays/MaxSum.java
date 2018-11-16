package twoDarrays;

import java.util.Arrays;

public class MaxSum {
	static long maxSum(int[][] matrix) {
        /*
         * Write your code here.
         */
        long originalSum = 0;
        if(matrix == null) return 0;
        
        int nColumns = matrix[0].length;
        long[] columnSum = new long[nColumns];
        for(int[] mat : matrix){
            int j = 0;
            for(int val: mat){
                originalSum+= val;
                columnSum[j++] += val;
            }
        }
        
        if(nColumns == 1) {
            return columnSum[0];
        }
        Arrays.sort(columnSum);
        
        long sum = 0;
        for(int i = 0; i < nColumns; i++){
            
                if(columnSum[i] >= 0)
                    sum += columnSum[i];
                else
                    sum += columnSum[i] * -1; // multiplying with -1 only twice
            
        }
        return Math.max(originalSum, sum);
    }
}
