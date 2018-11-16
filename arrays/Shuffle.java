package arrays;

import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		shuffleArray(arr);
		for(int i : arr)
	System.out.println(i);
		
	}
	
	public static void shuffleArray(int[] array) {
		
		for(int  i = 0 ; i < array.length; i++) {
			int m = getRandomNumberInRange(0, array.length - 1);
			swap(array, m, i);
		}
		
	}
	
	private static void swap(int[] arr, int m , int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
