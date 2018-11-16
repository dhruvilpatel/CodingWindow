package arrays;

public class SortingAlgo {


	 
	   
    public static void main(String a[]){
         
        int[] selectionSortArray = {10,34,2,56,7,67,88,42};
        int[] bubbleSortArray = {10,34,2,56,7,67,88,42};
        int[] insertionSortArray = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(selectionSortArray);
        int[] arr3 = doBubbleSort(bubbleSortArray);
        int[] arr4 = doInsertionSort(insertionSortArray);
        System.out.println("Selection Sort");
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("BubbleSort Sort");
        for(int i:arr3){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("Insertion Sort");
        for(int i:arr4){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    // we swap neighbouring elements and move the highest element on the top(last)
    public static int[] doBubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                	int temp;
        	        temp = array[i];
        	        array[i] = array[k];
        	        array[k] = temp;
                }
            }
        }
        return array;
    }
  
   
    // We iterate through the array and find the samllest number and swap it with the current indexing position
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    // we divide the array into two parts sorted and unsorted array. 
    // we iterate back to start index and place the variable to its actual sorted position.
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    
    
    private int array[];
    private int length;
 
    public void quickSort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        doQuickSort(0, length - 1);
    }
 
    private void doQuickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
        	doQuickSort(lowerIndex, j);
        if (i < higherIndex)
        	doQuickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private int[] tempMergArr;
    public void mergeSort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

    
}