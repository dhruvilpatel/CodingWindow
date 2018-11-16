package twoDarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixRotation {
public static void main( String args[]){
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

   /* String[] line = new String[3];
    try {
        line = buf.readLine().split(" ");
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    int m = Integer.parseInt(line[0]);
    int n = Integer.parseInt(line[1]);
    int num_rotations = Integer.parseInt(line[2]);
*/
    int[][] matrix = {{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16},{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16},
    {1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16},{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16}};
    
    /*for (int i = 0; i < m; ++i) {
        line = new String[n];
        try {
            line = buf.readLine().split(" ");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int j = 0; j < n; ++j) {
            matrix[i][j] = Integer.parseInt(line[j]);
        }
    } */
    
    //System.out.println(Arrays.deepToString(matrix));
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.printf("%4d", matrix[row][col]);
        }
        System.out.println();
    }
    System.out.println("Output ------------------------------");
    int[][] results = rotate(matrix, 1);

    //System.out.println(Arrays.deepToString(matrix));
    
    printMatrix(results);
}
  
private static int[][] rotate(int[][] m, int num_rotations) {
    int[][] output = m;
    		int layers = m.length / 2;
    	    int length = m.length - 1;
    	 
    	    for (int layer = 0 ; layer < layers ; layer++){
    	        for (int i = layer; i < length - layer ; i++){
    	            int temp = m[layer][i];
    	            //Left -> Top
    	            output[layer][i] = m[length - i][layer];
    	            //Bottom -> left
    	            output[length - i][layer] = m[length - layer][length - i];
    	            //Right -> bottom
    	            output[length - layer][length - i] = m[i][length - layer];
    	            //Top -> Right
    	            output[i][length - layer] = temp;
    	        }
    	    }
    
    return output;
}
  
private static void printMatrix(int[][] matrix) {
  for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
          System.out.printf("%4d", matrix[row][col]);
      }
      System.out.println();
  }
}
}