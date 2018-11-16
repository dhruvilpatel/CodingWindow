package arrays;

import java.util.ArrayList;

public class FlattenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 5, 7 }, { 2, 4 }, { 1, 9 } };
		ArrayList<Integer> answer = flattenList(arr);
		for (int a : answer) {
			System.out.println(a);
		}
	}

	public static ArrayList<Integer> flattenList(int[][] m) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		int[] pointer = generatePointer(m);

		while (true) {
			int[] tmp = new int[pointer.length];
			for (int i = 0; i < m.length; i++) {
				if (pointer[i] != -1) {
					tmp[i] = m[i][pointer[i]];
				}
			}

			if (checkTermination(pointer))
				break;
			int index = getMin(tmp);
			output.add(0, m[index][pointer[index]]);
			pointer[index] -= 1;

		}

		return output;
	}

	public static boolean checkTermination(int[] pointer) {
		for (int x : pointer) {
			if (x != -1)
				return false;
		}
		return true;
	}

	public static int getMin(int[] arr) {
		int max = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static int[] generatePointer(int[][] m) {
		int[] pointer = new int[m.length];

		for (int i = 0; i < m.length; i++) {
			pointer[i] = m[i].length - 1;
		}

		return pointer;
	}

}
