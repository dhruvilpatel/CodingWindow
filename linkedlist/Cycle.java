package linkedlist;

public class Cycle {
	
	boolean isCircular(SingleLinkedList head){
		SingleLinkedList fast = head;
		SingleLinkedList slow = head;
		
		while (fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if ( slow == fast ){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return false;
		}
		
		slow = head;
		
		while ( slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	

}
