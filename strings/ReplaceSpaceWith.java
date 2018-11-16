package strings;

public class ReplaceSpaceWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceSpaceWith20("Mr John Smith     ");

	}

public static void replaceSpaceWith20(String s){
		
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (String st : words){
			sb.append(st + "%20"); 
			
		}
		
		System.out.println(sb.toString());
		
		
	}
	
}
