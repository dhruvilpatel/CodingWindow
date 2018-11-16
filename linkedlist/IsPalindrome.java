package linkedlist;

import java.util.Stack;

public class IsPalindrome {

	
boolean isPalidrome(SingleLinkedList head){
		
		SingleLinkedList fast = head;
		SingleLinkedList slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while (fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		while ( slow != null){
			int top = stack.pop();
			
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}

//public SingleLinkedList isPalindrome(SingleLinkedList head) {
//	
//	
//	SingleLinkedList fast = head, slow = head, prev = null;
//	while (fast != null && fast.next != null) {
//		prev = slow;
//		slow = slow.next;
//		fast = fast.next.next;
//	}
//	prev.next = null;
//	reverse(slow);
//	return slow;
//	while (head != null && slow != null) {
//		if (head.data != slow.data)
//			return false;
//		head = head.next;
//		slow = slow.next;
//	}
//    return true;
//}

}
