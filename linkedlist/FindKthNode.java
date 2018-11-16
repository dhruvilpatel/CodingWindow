package linkedlist;

public class FindKthNode {

	// Time Complexity - O(n) and Space Complexity - O(1)
	public static void KthtotheLastElement(SingleLinkedList node, int k){
		
		SingleLinkedList slow = node;
		SingleLinkedList fast= node;
		
		for(int i=0 ;i<k-1;i++){
			if(fast == null) System.out.println("No Kth Element available");
			else fast = fast.next;
		}
		
		if(fast == null) System.out.println("No Kth Element available");
		
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		
		
		System.out.println("Kth Element will be : " + slow.data);
	}
}
