package strings;


public class LongestPalidrome {
	public static String getLongestPalindrome(String s) {
	    if (s.isEmpty()) {
	      return null;
	    }

	    if (s.length() == 1) {
	      return s;
	    }

	    String longest = s.substring(0, 1);
	    for (int i = 0; i < s.length(); i++) {
	      // test [i]
	      String tmp = helper(s, i, i);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;
	      }

	      // test s[i,i+1]
	      tmp = helper(s, i, i + 1);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;
	      }
	    }
	    return longest;
	  }

	  // [begin, end]
	  public static String helper(String s, int begin, int end) {
	    while (begin >= 0
	        && end <= s.length() - 1
	        && s.charAt(begin) == s.charAt(end)) {
	      begin--;
	      end++;
	    }
	    return s.substring(begin + 1, end);
	  }
	  
	  
	  // purestorage
	  public static int countPalindrome(String s) {
		    
		    
		    int count = s.length();
		    String longest = s.substring(0, 1);
		    for (int i = 1; i < s.length()-1; i++) {
		      // test [i]
		      int tmp = countHelper(s, i-1, i+1);
		      count += tmp;

		      // test s[i,i+1]
		      tmp = countHelper(s, i-1, i);
		      count += tmp;
		    }
		    return count;
		  }

		  // [begin, end]
		  public static int countHelper(String s, int begin, int end) {
			  int count = 0;
		    while (begin >= 0
		        && end <= s.length() - 1
		        && s.charAt(begin) == s.charAt(end)) {
		      begin--;
		      end++;
		      count++;
		    }
		    return count;
		  }
	  
	  public static void main(String args[]){
		  System.out.println(getLongestPalindrome("dhddhd"));
		  System.out.println(countPalindrome("dhddhd"));
	  }
}