package arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2};
		int[] arr1 = {3,4};
//		System.out.println(findMedianSortedArrays(arr, arr1));
		System.out.println(findMedianSortedArrays2(arr, arr1));
		int x = 123;
//		System.out.println((new StringBuilder(String.valueOf(x))).reverse());
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        
        int i =0, j =0 ;
        int tracker = 0 ;
        while(i < nums1.length && j < nums2.length && tracker < total/2){
            if(nums1[i]< nums2[j]) i++;
            else j++;
            tracker++;
        }
        if(tracker < total/2 ){
            while(i < nums1.length &&  tracker < total/2){
                i++;
                tracker++;
            }
            while(j < nums2.length &&  tracker < total/2){
                j++;
                tracker++;
            }
        }
        if(total % 2 != 0){
            return Math.min(nums1[i--], nums2[j--]);
        }else{
            return (nums1[i] + nums2[j]) / 2;
        }
        
    }

    static int total = 0;
    static Queue minHeap = new PriorityQueue<Integer>();
    static Queue maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
    int aL = nums1.length;
    int bL = nums2.length;
    if(aL == 0 && bL == 0){
        return 0.0; 
    }
    // if(aL == 1 && bL == 0){
    //     return (double) nums1[0];
    // }
    // if(bL == 1 && aL == 0){
    //     return (double) nums2[0];
    // }
   
    
    int a = 0;
    int b = 0;
    while(a < nums1.length && b < nums2.length){
        if(nums1[a] > nums2[b])  {   
            maxHeap.add(nums1[a]);
            a++;
        }else{
            maxHeap.add(nums2[b]);
            b++;
        }
        updateHeap();
        total++;
        }
        while(a < nums1.length){
            maxHeap.add(nums1[a]);
            a++;
            updateHeap();
            total++;
        }

    while(b < nums2.length){
            maxHeap.add(nums2[b]);
            b++;
            updateHeap();
            total++;
        }
    
    
        if(total % 2 != 0) return (double)((Integer) maxHeap.peek()).intValue();
        
        return ((int)maxHeap.peek() + (int)minHeap.peek()) / 2.0;
        
        
    }
    
public static void updateHeap(){
    if(total % 2 == 0){
            if(!minHeap.isEmpty() && (int)maxHeap.peek() > (int)minHeap.peek()){
                int max = (int)maxHeap.poll();
                int min = (int)minHeap.poll();
                minHeap.add(max);
                maxHeap.add(min);
            }
        }
            else{
                minHeap.add(maxHeap.poll());
            }
}   
	
//	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
//	    
//        Queue minHeap = new PriorityQueue<Integer>();
//        Queue maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
//        
//        int a = 0;
//        int b = 0;
//        int total = 0;
//        while(a < nums1.length && b < nums2.length){
//            if(nums1[a] > nums2[b])  {   
//                maxHeap.add(nums1[a]);
//                a++;
//            }else{
//                maxHeap.add(nums2[b]);
//                b++;
//            }
//            if(total % 2 == 0){
//                if(!minHeap.isEmpty() && (int)maxHeap.peek() > (int)minHeap.peek()){
//                    int max = (int)maxHeap.poll();
//                    int min = (int)minHeap.poll();
//                    minHeap.add(max);
//                    maxHeap.add(min);
//                }
//            }
//                else{
//                    minHeap.add(maxHeap.poll());
//                }
//            total++;
//            }
//        
//            while(a < nums1.length){
//                maxHeap.add(nums1[a]);
//                a++;
//                if(total % 2 == 0){
//                    if(!minHeap.isEmpty() && (int)maxHeap.peek() > (int)minHeap.peek()){
//                        int max = (int)maxHeap.poll();
//                        int min = (int)minHeap.poll();
//                        minHeap.add(max);
//                        maxHeap.add(min);
//                    }
//                }
//                    else{
//                        minHeap.add(maxHeap.poll());
//                    }
//                total++;
//            }
//        while(b < nums2.length){
//                maxHeap.add(nums1[b]);
//                b++;
//                if(total % 2 == 0){
//                    if(!minHeap.isEmpty() && (int)maxHeap.peek() > (int)minHeap.peek()){
//                        int max = (int)maxHeap.poll();
//                        int min = (int)minHeap.poll();
//                        minHeap.add(max);
//                        maxHeap.add(min);
//                    }
//                }
//                    else{
//                        minHeap.add(maxHeap.poll());
//                    }
//                total++;
//            }
//        
//            if(total % 2 != 0) return (Double) maxHeap.peek();
//            
//            return ((int)maxHeap.peek() + (int)minHeap.peek()) / 2.0;
//            
//            
//        }
	
}
