package linkedlist;

import java.util.Stack;
public class Reverse {

void reverse(SingleLinkedList node) {
		
		SingleLinkedList fast = node;
		SingleLinkedList slow = node;
		Stack<Integer> stack = new Stack<Integer>();
		
		while (fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			stack.push(slow.data);
			slow = slow.next;
		}
		while ( !stack.isEmpty()){
			int top = stack.pop();
			addRear(top);
			
		}
		while(slow!=null){
			addRear(slow.data);
			slow = slow.next;
		}
		
//		 SingleLinkedList prev = null;
//		 SingleLinkedList current = node;
//		 SingleLinkedList next = null;
//	        while (current != null) {
//	            next = current.next;
//	            current.next = prev;
//	            prev = current;
//	            current = next;
//	        }
//	        node = prev;
//	        return node;
	    }
	
	
//	private static SingleLinkedList reverse(SingleLinkedList slow) {
//		SingleLinkedList prev = null, head = slow, cur = slow;
//		while (cur != null) {
//			SingleLinkedList next = cur.next;
//			cur.next = prev;
//			prev = cur;
//			cur = next;
//		}
//		sf.Print();
//		return prev;
//	}
	
public static void completeReverse(SingleLinkedList current){
	SingleLinkedList temp = null;
	SingleLinkedList prev = null;
	
	while(current!=null){
		temp = current.next;
		current.next = prev;
		prev = current;
		current = temp;
		
		
		
	}
	
	current = prev;
	
	
}

public static void reverseFirstHalf(SingleLinkedList current){
	
	SingleLinkedList temp = null;
	SingleLinkedList prev = null;

	SingleLinkedList fast = current;
	SingleLinkedList finalAnswer = current;
	
	
	while(fast != null && fast.next != null){
		fast = fast.next.next;
		temp = current.next;
		current.next = prev;
		prev = current;
		current = temp;
	}
	
	finalAnswer.next = temp;
	
	
}
public static void reverseLastHalf(SingleLinkedList list){
	
	SingleLinkedList finalAnswer = list;
	SingleLinkedList slow = list;
	SingleLinkedList fast = list;
	
	while(fast != null && fast.next != null){
		finalAnswer = slow;
		slow=slow.next;
		fast = fast.next.next;
	}
	SingleLinkedList temp = null;
	SingleLinkedList prev = null;
	
	while(slow!=null){
		temp = slow.next;
		slow.next = prev;
		prev = slow;
		slow = temp;
		
		
		
	}
	
	finalAnswer.next = prev;
	
	
}

//public SingleLinkedList recurseReverse(SingleLinkedList list)
//{
//  if (list == null || list.next == null) return list;
//  SingleLinkedList reverseRest = recurseReverse(list.next);
//  list.next.next = list;
//  list.next = null;
// 
//  return reverseRest;
//}

//A simple and tail recursive function to reverse
//a linked list.  prev is passed as NULL initially.
SingleLinkedList reverseReverse(SingleLinkedList curr, SingleLinkedList prev) {

  /* If last node mark it head*/
  if (curr.next == null) {
      head = curr;

      /* Update next to prev node */
      curr.next = prev;
      return null;
  }

  /* Save curr->next node for recursive call */
  SingleLinkedList next1 = curr.next;

  /* and update next ..*/
  curr.next = prev;

  reverseReverse(next1, curr);
  return head;
}
}
	
}
