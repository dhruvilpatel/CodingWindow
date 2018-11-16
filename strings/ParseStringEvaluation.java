package strings;

import java.util.Stack;

public class ParseStringEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list = new ArrayList<String>();=
		String[] str= new String[]{"(S (NP (NNP James)) (VP (VBZ is) (NP (NP (DT a)(NN boy)) "+
			"(VP (VBG eating) (NP (NNS sausages))))))"};
		
		System.out.println(generateSentence(str[0]));
	}
	
	static String generateSentence(String s){
		Stack<Character> ps = new Stack<Character>();
		Stack<Character> ss = new Stack<Character>();
		StringBuilder str = new StringBuilder();
		for(char c : s.toCharArray()){
			
			if(c == '(') ps.push(c);
			else if(c == ')') {
				StringBuilder sb = new StringBuilder();
				while(!ss.isEmpty()){
					char top = ss.pop();
					if(top == ' '){
						str.append(sb.reverse() + " ");
						ss.clear();
					}else{
						sb.append(top);
					}
				}
				
			}else{
				ss.push(c);
			}
			
			
		}
		
		return str.toString();
	}

}
