package strings;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseWordsInString("Your job is done"));
	}
	
	static String reverseWordsInString(String s) {
		
		String[] input = s.trim().split(" ");
		
		for(int start = 0, end = input.length - 1; start< end ; start++, end--) {
			String tmp = input[start];
			input[start] = input[end];
			input[end] = tmp;
		}
		return String.join(" ", input);
	}
}
