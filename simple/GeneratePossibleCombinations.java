package simple;

import java.util.ArrayList;
import java.util.List;

public class GeneratePossibleCombinations {
	
	static List<List<Integer>> output = new ArrayList<List<Integer>>();
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		generateCombinations(new ArrayList<Integer>(), 0, 5);
		sumCombinations(new ArrayList<Integer>(), 5);
		for(List<Integer> al: output) {
			for(Integer c : al) {
				System.out.print(c + ", ");
			}
			System.out.println("");
		}
 	}
	
	// not working
	public static void generateCombinations(ArrayList<Integer> num, int soFar, int sum) {
		
		if(soFar == sum) {
			output.add(num);
		}
		int index = 1;
		
		while(index <= sum - soFar) {
			num.add(index);
			generateCombinations(num, soFar + index, sum);	
			index++;
		}
	}

	
	public static void sumCombinations(List<Integer> ls, int n) {
		System.out.println(n);
		if(n == 0) {
 			output.add(new ArrayList<Integer>(ls));
//			
		}
		else if(n > 0) {
			
			for(int k = 1 ; k <= n ; k++) {				
				ls.add(k);
				sumCombinations(ls, n - k);
				ls.remove(ls.size()-1);
			}
		}
		
	}
}
