package strings;

public class JustifyString {

	public static void main(String[] args) {
		System.out.println(justifyText("Dhruvil", 20));
		System.out.println(justifyText("The quick brown fox jumps over the lazy dog.", 52));
		System.out.println(justifyText("Hello World", 20));
		System.out.println(justifyText("I love nature!", 20));
		System.out.println("12345678901234567890123456789012345678901234567890123456789");
	}

	public static String justifyText(String input, int buffer) {

		if (input.length() > buffer)
			return input;

		String[] inputArr = input.split(" ");
		int length = inputArr.length - 1;
		if (length < 1) {
			return input + createSpace(buffer - input.length() - 1);
		}

		int leftOver = buffer - input.length();
		int divisor = leftOver / length;
		int remainder = leftOver % length;

		StringBuilder result = new StringBuilder();

		String space = createSpace(divisor);

		for (int i = 0; i < length; i++) {
			result.append(inputArr[i] + space);
			if (remainder > 0) {
				result.append(" ");
				remainder--;
			}
		}
		result.append(inputArr[length]);
		return result.toString();
	}

	public static String createSpace(int len) {
		StringBuilder space = new StringBuilder();
		for (int i = 0; i <= len; i++) {
			space.append(" ");
		}
		return space.toString();
	}
}
