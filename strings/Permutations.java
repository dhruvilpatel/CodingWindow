package strings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		getPermutedString("abcd");
		ArrayList<String> res = findPermutations("wxyz");
		for(String x: res) System.out.println(x);
		System.out.println(R("", "abcd"));
	}

	public static void getPermutedString(String s) {
		getPermutedString(s.toCharArray(), 0);
	}

	public static void getPermutedString(char[] x, int l) {

		if (l == x.length) {
			System.out.println(new String(x));
//			System.out.println(String.copyValueOf(x));
		} else {
			for (int i = l; i < x.length; i++) {
				swap(x, l, i);
				getPermutedString(x, l + 1);
				swap(x, l, i);

			}
		}
	}

	public static void swap(char[] x, int i, int j) {
		char temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

	public static ArrayList<String>	findPermutations(String str) {

		ArrayList<String> permutations = new ArrayList<String>();

		permutations.add(new String());
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			ArrayList<String> tempList = new ArrayList<String>();

			for (String s : permutations) {
				for (int i = 0; i < s.length(); i++)
					tempList.add(new String(s.substring(0, i) + c + s.substring(i, s.length())));
				tempList.add(new
				String(s + c));
			}
			permutations = tempList;
		}
		return permutations;

	}
	
	public static String R(String x, String y) {
		String s = "";
		if(y.length() == 1) {
		s += x + y + " " ;
		}
		else {
		for(int i = 0; i < y.length(); i++) {
		s += R(x + y.substring(i, i + 1),
		y.substring(0, i) + y.substring(i + 1, y.length()));
		}
		}
		return s;
		}

}
