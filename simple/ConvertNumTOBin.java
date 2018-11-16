package simple;

class ConvertNumTOBin {
	// package whatever; // don't place package name!

	// Write a program to convert an integer to the integer representation of all
	// the bytes in that integer

	// 569878 -> 00000000 00001000 10110010 00010110 -> [0,8,178,22]

	//

	public static void main(String[] args) {
		System.out.println("Hello Java");
		int[] output = returnBinaryIntegers(569878);
		for (int out : output) {
			System.out.println(out);
		}
	}

	public static int[] returnBinaryIntegers(int num) {
		System.out.println("HEy Theres");
		// "00000000000010001011001000010110"
		int[] arr = new int[4];
		String value = convertToBinary(num);

		int counter = 0;
		for (int i = 0; i < value.length(); i = i + 8) {

			String tmp = value.substring(i, i + 8); // 00000000
			arr[counter] = convertToInt(tmp);
			counter++;

		}

		return arr;

	}

	public static int convertToInt(String binary) {
		// 00000110 ==> 6
		int answer = 0;
		String intArray[] = binary.split(""); // [ 0, 0, 0 , 0 ,0, 1, 1, 0]

		for (int i = intArray.length - 1; i >= 0; i--) {

			if (intArray[i].equals("1")) {
				answer += Math.pow(2, intArray.length - 1 - i); // 2 2 = 4
			}

		}

		return answer;

	}

	public static String convertToBinary(int num) {
		// num = 569878
		// it will convert the number to binary format and store it to string
		// 5 => 101
		// 6 =>

		StringBuilder sb = new StringBuilder();
		while (num > 0) {

			int rem = num % 2;
			num = num / 2;
			sb.insert(0, rem);

		}

		int difference = 32 - sb.length();
		while (difference > 0) {
			sb.insert(0, "0");
			difference--;
		}

		return sb.toString();

	}

}
