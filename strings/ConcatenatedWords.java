package strings;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ConcatenatedWords {

	// Red-Black structured tree to hold the words.
		TreeMap<String, Integer> wordTree;

		// Dictionary of all words received.
		ArrayList<String> dictionary;

		/**
		 * Constructor for variable initialization.
		 */
		public ConcatenatedWords() {
			wordTree = new TreeMap<String, Integer>(new StringLengthComparator());
			dictionary = new ArrayList<String>();
		}

		/**
		 * Adds one word to the dictionary of words receieved.
		 *   
		 * @param word The word to add.
		 * @param order The order the word was received in.
		 */
		public void addWord(String word, Integer order) {
			wordTree.put(word, order);
			dictionary.add(word);
		}

		/**
		 * Find the longest compound word in the built word dictionary.
		 * 
		 * @return The longest compound word found in the dictionary.
		 */
		public String findLongestCompoundWord() {
			while (wordTree.size() > 0) {
				String word = wordTree.lastKey();
				
				wordTree.remove(word);
				dictionary.remove(word);
				if (isCompoundWord(word))
					return word;
			}
			return "dhruvil";
		}

		/**
		 * Tells if a word is a compound word or not.
		 * 
		 * @param word The word to check if it's a compound word or not.
		 * @return True if the given word is a compound word.  False otherwise.
		 */
		private boolean isCompoundWord(String word) {

			if (dictionary.contains(word)) return true;
			
			for (int i = 1; i < word.length(); i++) {
				String prefix = word.substring(0, i);
				if (isCompoundWord(prefix)) {
					String remainder = word.substring(i, word.length());
					if (remainder.length() == 0) return true;
					if(isremainder(remainder)){
						return true;
					}
				}
			}
			return false;
		}
		private boolean isremainder(String word){
		
if (dictionary.contains(word)) return true;
			
			for (int i = 1; i < word.length(); i++) {
				String prefix = word.substring(0, i);
				if (isremainder(prefix)) {
					String remainder = word.substring(i, word.length());
					if (remainder.length() == 0) return true;
					
				}
			}
			return false;
		}
	public static void main(String[] args) {

		File file = new File("C:\\Users\\Dhruvil\\Desktop\\wordsforproblem.txt");
		
		
		ConcatenatedWords cwf = new ConcatenatedWords();
		String word;
		int order = 0;

		try {
			Scanner br = new Scanner(file);
			while (br.hasNextLine()) {
				word = br.nextLine();
				if (word.length() == 0)
					continue;
				// Adds word by word to Tree and dictionary
				cwf.addWord(word, order++);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cwf.findLongestCompoundWord());

	}
//	public static void main(String[] args) {
//
//		File file = new File("C:\\Users\\Dhruvil\\Desktop\\wordsforproblem.txt");
//		String[] s = {"zig",
//				"zag",
//				"zigzagging",
//				"zagging",
//				"zagged",
//				""
//			
//				
//				
//				};
//		
//		ConcatenatedWords cwf = new ConcatenatedWords();
//		String word;
//		int order = 0;
//
//		try {
//			Scanner br = new Scanner(file);
//			while ((order<s.length)) {
//				if (s[order].length() == 0)
//					continue;
//				// Adds word by word to Tree and dictionary
//				cwf.addWord(s[order], order++);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(cwf.findLongestCompoundWord());
//
//	}
	/**
	 * This class is used as a comparator for Strings based on their lengths.
	 * 
	 * @author Wesam Elshamy
	 */
	class StringLengthComparator implements Comparator<String> {
		@Override
		public int compare(String arg0, String arg1) {
			return arg0.length() - arg1.length();
		}
	}
}
