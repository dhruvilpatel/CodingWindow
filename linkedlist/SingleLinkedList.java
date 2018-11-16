package linkedlist;

class SingleLinkedList {
	int data; 
	SingleLinkedList next;
	
	SingleLinkedList(int data){
		this.data = data;
	}
	
	SingleLinkedList (int data, SingleLinkedList next){
		this.data = data;
		this.next = next;
	}
	
	public int Data(){
		return data;
	}
	
}
