package strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


// Blackrock
public class NetAssetsEvaluation {

	public static void main(String[] args){
		String input = "PORT:AXN,10,10;BGT,20,30;CXZ,10,30|BENCH:AXN,50,10;BGT,30,30;DFG,30,20";
		HashMap<String, Integer> hm = new HashMap();
		String[] nav = input.split("\\|");
		
		for(String n : nav){
			System.out.println("Nav: " + n);
			String[] stock = n.split(":")[1].split(";");
			int total = calculateTotal(stock);
			System.out.println("Total " + Integer.toString(total));
			for(String s : stock){
				String[] values = s.split(",");
				
				int percentage = (Integer.parseInt(values[1]) * Integer.parseInt(values[2])) * 100/total;
				System.out.println(Integer.parseInt(values[1]));
				if(hm.containsKey(values[0])){
					hm.put(values[0], hm.get(values[0]) - percentage);
				}else{
					if(n.split(":")[0].equals("BENCH"))
						hm.put(values[0], -percentage);
					else hm.put(values[0], percentage);
				}
			}
		}
		TreeMap<String, Integer> sorted = new TreeMap<>(hm);
		Set<Entry<String, Integer>> mappings = sorted.entrySet(); 
		System.out.println("HashMap after sorting by keys in ascending order ");
		for(Entry<String, Integer> mapping : mappings)
		{ System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

	}
	
	static int calculateTotal(String[] stock){
		int total = 0;
		for(int i = 0 ; i < stock.length; i++){
		String[] values = stock[i].split(",");
		total += (Integer.parseInt(values[1])* Integer.parseInt(values[2]));
		}
		return total;
	}
	
	
	
	
}
