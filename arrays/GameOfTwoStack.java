package arrays;

import java.util.Scanner;

public class GameOfTwoStack {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int[] a = {2,4,4};
    	int[] b = {1,2,4};
            int n = a.length;
            int m = b.length;
            int x = 4;
            int aCount = 0;
            int bCount = 0;
            int check = x;
          
            // your code goes here
            
//            while(check > 0){
//            	if( i != n && j !=m && (check >= a[i] || check >= b[j])){
//                if(a[i]>b[j] ){
//                        check -= b[j];
//                        j++;
//                    }
//                else{
//                    check -= a[i];
//                        i++;
//                }
//                
//            	}
//            	else{
//            		if(i != n && check >= a[i]){
//            			check -= a[i];
//                        i++;
//            		}
//            		else if( j != m && check >= b[j]){
//            			check -= b[j];
//                        j++;
//            		}
//            		else{
//            			break;
//            		}
//            	}
//            	mixCount++;
//            }
            
            int mixCount = 0;
            check = x;
            int i = 0,j = 0;
            while(check > 0 && i < n && j < m  && (check >= a[i] || check >= b[j]) ){
            	
                if(a[i]>b[j] ){
                        check -= b[j];
                        j++;
                    }
                else if(b[j]> a[i]){
                    check -= a[i];
                        i++;
                }
                else if( i +1 <n && j+1 <m){
                	if(a[i+1]>b[j+1] ){
                        check -= b[j];
                        j++;
                    }
                else {
                    check -= a[i];
                        i++;
                }
                }
            	mixCount++;
            }
            if(i<n && check > 0 && check >= a[i]){
            	while(i < n && check > 0  && check >= a[i]){
            		check -= a[i];
                    i++;
                    mixCount++;
            	}
            }else if(j<m && check > 0  && check >= b[j]){
            	while(j < m && check > 0  && check >= b[j]){
            		check -= b[j];
                    j++;
                    mixCount++;
            }
            }
            System.out.println(Math.max(Math.max(aCount,bCount),mixCount));
        
        
        
	}
}
