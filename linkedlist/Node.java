package linkedlist;

public class Node {
	private static int counter;
	public int data;
	public Node next;
	Node(int data){
		this.data = data;
	}
	
	public static void main(String args[]) {
		counter = 0;
		counterI();
		System.out.println(counter);
	}
	
	static void counterI() {
		counter++;
	}
}

class LinkedNode {
	int data;
	LinkedNode next;
	LinkedNode(int data){
		this.data = data;
	}
}



