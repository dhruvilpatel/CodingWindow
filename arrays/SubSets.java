package arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		
		Set<Set<Integer>> answer = getSubsets(a);
		
		for(Set<Integer> c : answer) {
			for( Integer x: c) {
				System.out.print(x);
				
			}
			System.out.println();
	}

	}
	public static Set<Set<Integer>>	getSubsets(Set<Integer> a)	{
		
		Set<Set<Integer>> subsets = new HashSet<Set<Integer>>();

		subsets.add(new HashSet<Integer>());
		for (Integer o : a) {
			Set<Set<Integer>> temp = new HashSet<Set<Integer>>();
			for (Set<Integer> s : subsets)
				temp.add(new HashSet<Integer>(s));
			for (Set<Integer> s : temp)
				s.add(o);
			subsets.addAll(temp);
		}
		return subsets;

	}
	
	public static ArrayList<ArrayList<Integer>> getSubset(HashSet<Set<Integer>> sets){
		
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		subsets.add(new ArrayList<Integer>());
		
		for(Set<Integer> x: sets){
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> c : subsets) {
				temp.add(c);
			}
			
			for(ArrayList<Integer> o : temp) {
				o.addAll(x);
			}
			subsets.addAll(temp);
			
		}
		
		
		
		
		return subsets;
	}
	
	
}
