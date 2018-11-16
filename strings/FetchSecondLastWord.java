package strings;

public class FetchSecondLastWord {
	
	public static void main(String args[]) {
		System.out.println(getSecondLastWord("     Dhruvil Your job is done    "));
	}
	
	
	static String getSecondLastWord(String s) {
		String input = s.trim();
		
		String[] inputArray = input.split(" ");
		
		return inputArray[inputArray.length - 2];
		
	}
}
