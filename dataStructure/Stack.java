package dataStructure;

import java.util.Arrays;

public class Stack {
	int top = -1;
	int size;
	int[] arr;
	int bottom;
	
		Stack(){
			this.arr = new int[10];
		}
		
		Stack(int size){
			this.arr = new int[size];
			this.size = size;
		}
	
		void push(int x){
			if(top + 1 < size){
				top++;
				arr[top] = x;
				System.out.println(arr[top]);
			}else{
				System.out.println("Stack is Full");
			}
			
		}
		
		void pop(){
			if(top == -1){
				System.out.println("EMPTY");
				}else {
					top--;
					if(top == -1) {
						System.out.println("EMPTY");
					}else {
						System.out.println(arr[top]);
					}
					
				}
			
		
		}
		
		void inc(int e, int k) {
			if(e-1 > top) {
				System.out.println("There are not many elements in stack");
			}else {
				for(int i = 0; i < e; i++) {
					arr[i] = arr[i] +  k;
				}
				System.out.println(arr[top]);
			}
			
		}
		
		public static void superStack(String[] operations) {
			Stack st = new Stack(2);
			
			for( int i = 0 ; i < operations.length  ; i++) {
				String[] words = operations[i].split(" ");
				switch(words[0]) {
				case "push":
					st.push(Integer.parseInt(words[1]));
					break;
				case "pop":
					st.pop();
					break;
				case "inc":
					st.inc(Integer.parseInt(words[1]),Integer.parseInt(words[2]));
					break;
				}
			}
		}
	public static void main(String[] StringOperation) {
		// TODO Auto-generated method stub
		
		
//		int size = sc.nextInt();
//		Stack st = new Stack(size);
//		while(sc.hasNext()) {
//			String line = sc.nextLine();
//			
//		}
		
		
		String[] arr = {"push 4", "pop","push 3","push 5","push 2", "inc 3 1", "pop", "push 1", "inc 2 2", "push 4", "pop", "pop"};
		superStack(arr);
		System.out.println(arrange("The lines are printed in reverse order."));
//		st.pop();
//		st.push(3);
//		st.push(5);
//		st.push(2);
//		st.inc(3, 1);
//		st.pop();
//		st.push(1);
//		st.inc(2,2);
//		st.push(4);
//		st.pop();
//		st.pop();
	}
	static String arrange(String sentence) {

	    String[] arr = new String[sentence.length() + 1];
	    Arrays.fill(arr, "");
	    for(String word : sentence.split("[^a-zA-Z'\\-]+")) 
	    {
	        arr[word.length()] += word.toLowerCase() + " ";
	    }
	    StringBuilder sb= new StringBuilder();
	    for(String s : arr) {
	    	sb.append(s);
	        }
	    String output = sb.substring(0, 1).toUpperCase() + sb.substring(1);
	    return output.trim() + ".";
	    }
}
