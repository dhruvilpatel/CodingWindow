package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HashParenthesis {
	private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }  

    private HashParenthesis() {};

    /**
     * Returns true is parenthesis match open and close.
     * Understands [], {}, () as the brackets
     * It is clients responsibility to include only valid paranthesis as input.
     * A false could indicate that either parenthesis did not match or input including chars other than valid paranthesis
     * 
     * @param str   the input brackets
     * @return      true if paranthesis match.
     */
    public static boolean isBalanced(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("String length should be greater than 0");
        }
        // odd number would always result in false
        if ((str.length() % 2) != 0) {
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            } 
        }
        if(str.length() > 0 && !stack.isEmpty()){
			return false;
		}
        return true;
    } 

    public static void main(String[] args) {
        assertEquals(true, isBalanced("{{"));
        assertEquals(false,isBalanced("([}])"));
        assertEquals(true, isBalanced("([])"));
        assertEquals(true, isBalanced("[()[]{}[][]]"));
        
        System.out.println(isValid("{{"));
        System.out.println(isValid("([}])"));
        System.out.println(isValid("([])({)"));
        System.out.println(isValid("[()[]{}[][]]"));
    }

	private static void assertEquals(boolean b, boolean balanced) {
		// TODO Auto-generated method stub
		if(b = balanced){
			System.out.println("Balanced");
		}else{
			System.out.println("UnBalanced");
		}
		
	}
	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
	
}

//Time complexity: O(n) where n is length of the string
//Space complexity: O(n/2) where n is length of string
