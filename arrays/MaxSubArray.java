package arrays;

// Blackrock
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int[] arr = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		System.out.println(getMaxSubArray(arr));
		System.out.println(find_maximum_subarray_iterative(arr));
	}

	public static int getMaxSubArray(int[] array) {

		int here = 0;
		int sofar = array[0];

		for (int x : array) {
			here = Math.max(x, here + x);
			sofar = Math.max(sofar, here);
		}
		return sofar;
	}

	static int find_maximum_subarray_iterative(int[] arr) {
		int here = 0;
		int sofar = arr[0];
		for (int i = 0; i < arr.length; i++) {
			here = Math.max(here + arr[i], arr[i]);
			sofar = Math.max(here, sofar);
		}
		return sofar;
	}

	static int find_maximum_subarray_brute(int[] A, int low, int high) {
		int[] Sum_arr = new int[500];
		int count = 0;
		int max = A[0];
		for (int i = low; i < high; i++) {
			int update = 0;
			for (int j = i; j < high; j++) {
				update = A[j] + update;
				Sum_arr[count] = update;
				if (max < Sum_arr[count]) {
					max = Sum_arr[count];
				}
				count++;
			}
		}

		return max;
	}

	static int find_maximum_crossing_subarray(int[] A, int low, int mid, int high) {

		System.out.print("here");

		int here_left = 0;
		int sofar_left = A[0];
		int here_right = 0;
		int sofar_right = A[mid];
		int index_i = 0;
		int index_j = mid;
		for (int i = mid; i >= low; i--) {
			here_left = Math.max(here_left + A[i], A[i]);
			if (here_left > sofar_left) {
				sofar_left = here_left;
				index_i = i;

			}

		}
		for (int i = mid + 1; i < high; i++) {
			here_right = Math.max(here_right + A[i], A[i]);
			if (here_right > sofar_right) {
				sofar_right = here_right;
				index_j = i;

			}

		}

		System.out.println("I is : " + index_i + "  and J is : " + index_j);
		return Math.max(Math.max(sofar_left, sofar_right), sofar_left + sofar_right);
	}

	static int find_maximum_crossing_subarray_alternatively(int[] A, int low, int mid, int high) {

		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		int max_left = 0;
		for (int i = mid; i >= low; i--) {
			sum = sum + A[i];

			if (sum > left_sum) {
				left_sum = sum;
				max_left = i;
			}
		}
		int right_sum = Integer.MIN_VALUE;
		sum = 0;
		int max_right = 0;

		for (int i = mid + 1; i <= high; i++) {
			sum = sum + A[i];

			if (sum > right_sum) {
				right_sum = sum;
				max_right = i;
			}
		}

		return Math.max(Math.max(left_sum, right_sum), left_sum + right_sum);
	}

	static int find_maximum_subarray_recursive(int[] A, int low, int high) {
		int mid = A.length;

		find_max_subarray(A, low, mid);

		return 0;
	}

	static int find_max_subarray(int[] A, int low, int high) {

		if (low == high) {
			return A[low];
		}
		int left_sum = find_max_subarray(A, low, (low + high) / 2);
		int right_sum = find_max_subarray(A, (low + high) / 2 + 1, high);
		int cross = find_maximum_crossing_subarray_alternatively(A, low, (low + high) / 2, high);

		return Math.max(Math.max(left_sum, right_sum), cross);
	}
}
