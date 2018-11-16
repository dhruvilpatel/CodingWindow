package arrays;

import java.util.HashMap;

public class MaxAverageGrade {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[][] scores = {{"Dhruvil","96"},{"Tejas", "94"},{"Dhruvil","-99"},{"Nehal", "80"}};
//		
//		System.out.println(Integer.parseInt("-99"));
//	}
//
//	static int calculateMaxAverageGrade(String[][] scores){
//		
//		HashMap<String, Person> set = new SortedMap<String, Person>();
//		for(int i = 0 ; i < scores.length; i++){
//			String name = scores[i][0];
//			int value = Integer.parseInt(scores[i][1]);
//			if(set.containsKey(name)) {
//				Person p = set.get(name);
//				int avg = p.getCounter();
//				p.setAverageGrade(p.averageGrade / avg);
//			}else {
//				Person person = new Person(name, value);
//				set.put(name, person);
//			}
//		}
//	}
//	
//}
//
//class Person implements Comparable {
//
//	float averageGrade;
//	String name;
//	int counter;
//
//	Person(String name, int averageGrade) {
//		this.name = name;
//		this.averageGrade = averageGrade;
//		this.counter = 1;
//	}
//
//	public int getCounter() {
//		return this.counter;
//	}
//	
//	public void updateCounter() {
//		this.counter += 1;
//	}
//	
//	public float getAverageGrade() {
//		return averageGrade;
//	}
//
//	public void setAverageGrade(float averageGrade) {
//		this.averageGrade = averageGrade;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		if (this.averageGrade == ((Person) o).averageGrade)
//			return 0;
//		else if (this.averageGrade > ((Person) o).averageGrade)
//			return 1;
//		return -1;
//	}
//
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Person))
//			return false;
//		Person person = (Person) obj;
//		if (this.name != person.getName())
//			return false;
//		return true;
//
//	}

	public static void main(String[] args) {
		String[][] scores = {{"Dhruvil","96"},{"Tejas", "94"},{"Dhruvil","-99"},{"Nehal", "80"}};
		System.out.println(calculateMaxAverageGrade(scores));
	}

	static int calculateMaxAverageGrade(String[][] scores){
		int max = 0;
		int len = scores.length;
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < len; i++){
			String name = scores[i][0];
			int value = Integer.parseInt(scores[i][1]);
			if(dict.containsKey(name)){
				dict.put(name, dict.get(name) + value);
				count.put(name, count.get(name) + 1);
			}
			else{
				dict.put(name, value);
				count.put(name, 1);
			}
//			int score = dict.get(name);
//			int occurence = count.get(name);
//			
//			if(score/occurence > max) max = score/occurence;
		}
		
		
		for(String s : dict.keySet()){
			
			int score = dict.get(s);
			int occurence = count.get(s);
			
			if(score/occurence > max) max = score/occurence;
			
		}
//		
		return max;
	}
}