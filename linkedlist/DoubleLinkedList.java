package linkedlist;

public class DoubleLinkedList {

	 int data;
	
	DoubleLinkedList prev;
	DoubleLinkedList next;
	
	DoubleLinkedList(int data){
		this.data = data;
	}
	DoubleLinkedList(DoubleLinkedList prev,int data, DoubleLinkedList next){
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	
	public int Data(){
		return data;
	}
}