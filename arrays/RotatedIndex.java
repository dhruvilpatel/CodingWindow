package arrays;

public class RotatedIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 8, 1, 2, 3, 4, 5 };
		System.out.println(rotatedIndex(arr));
		System.out.println(pivotedBinarySearch(arr, 5));
		System.out.println(searchRotatedArray(arr, 5));
	}

	public static int rotatedIndex(int[] arr) {
		int high = arr.length;
		int low = 0;

		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[low])
				low = mid + 1;
			else
				high = mid;
		}

		return low;
	}

    static int pivotedBinarySearch(int arr[], int key)
    {
       int pivot = rotatedIndex(arr);
       
       // If we didn't find a pivot, then 
       // array is not rotated at all
       if (pivot == -1)
           return binarySearch(arr, 0, arr.length -1, key);
       
       // If we found a pivot, then first 
       // compare with pivot and then
       // search in two subarrays around pivot
       if (arr[pivot] == key)
           return pivot;
       if (arr[0] <= key)
           return binarySearch(arr, 0, pivot-1, key);
       return binarySearch(arr, pivot+1, arr.length-1, key);
    }
    
    static int binarySearch(int arr[], int low, int high, int key)
    {
       if (high < low)
           return -1;
        
       /* low + (high - low)/2; */      
       int mid = (low + high)/2;  
       if (key == arr[mid])
           return mid;
       if (key > arr[mid])
           return binarySearch(arr, (mid + 1), high, key);
       return binarySearch(arr, low, (mid -1), key);
    }
	public static int searchRotatedArray(int A[], int key) {
		int L = 0;
		int R = A.length - 1;

		while (L <= R) {
			// Avoid overflow, same as M=(L+R)/2
			int M = L + ((R - L) / 2);
			if (A[M] == key)
				return M;

			// the bottom half is sorted
			if (A[L] <= A[M]) {
				if (A[L] <= key && key < A[M])
					R = M - 1;
				else
					L = M + 1;
			}
			// the upper half is sorted
			else {
				if (A[M] < key && key <= A[R])
					L = M + 1;
				else
					R = M - 1;
			}
		}
		return -1;

	}
}