package linkedlist;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(5);
		n1 = appendFront(n1, 2);
		n1 = appendFront(n1, 1);
		Node n2 = new Node(7);
		
		Node sum = calculateSum(n1, n2);
		
		while(sum != null) {
			System.out.println(sum.data);
			sum = sum.next;
		}
	}

	
	static Node calculateSum(Node n1, Node n2){
		int first = getLength(n1);
		int second = getLength(n2);
		
		if(first > second) {
			n2 = appendZero(n2, first - second);
		}else{
			n1 = appendZero(n1, second - first);			
		}
		
		PartialSum sum = recursiveSum(n1, n2);
		
		if(sum.carry > 0) {
			sum.sum = appendFront(sum.sum, sum.carry);
		}
		return sum.sum;
	}
	
	static class PartialSum {
		Node sum = null;
		int carry;
	}
	
	static PartialSum recursiveSum(Node n1, Node n2) {
		
		if(n1 == null && n2 == null) { 
			PartialSum sum = new PartialSum();
			return sum;
		}
		
		PartialSum res = recursiveSum(n1.next, n2.next);
		int val = n1.data + n2.data + res.carry;
		int remainder = val % 10;
		
		Node n = appendFront(res.sum, remainder);
		res.sum = n;
		res.carry = val / 10;
		return res;
		
	}
	
	static Node appendZero(Node n, int count) {
		
		if(count  == 0) return n;
		while(count > 0) {
			n = appendFront(n, 0);
			count--;
		}
		
		return n;
	}
	
	static Node appendFront(Node n, int value) {
		
		Node curr = new Node(value);
		
		curr.next = n;
		
		return curr;
		
	}
	
	static int getLength(Node n){
		
		int length = 0 ;
		
		while(n != null) {
			length++;
			n = n.next;
		}
		
		return length;
		
	}
	
}
