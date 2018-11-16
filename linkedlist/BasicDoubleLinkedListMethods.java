package linkedlist;

public class BasicDoubleLinkedListMethods {

	DoubleLinkedList head;

	int size ;
	public BasicDoubleLinkedListMethods(){
		head = null;
		size = 0;
	}
	
	public void addFront(int data){
			if(head == null){
				head = new DoubleLinkedList(null,data,null);
			}
			else{
				DoubleLinkedList newlink = new DoubleLinkedList(null, data, head);
				head.prev = newlink;
				head = newlink;
				
			}
	}
	public void RemoveFront(){
		if (head == null){
			System.out.println("List is Empty");
		}
		else{
			head = head.next;
			head.prev = null;
		}
	}
	public void addRear(int data){
		if(head == null){
			head = new DoubleLinkedList(null,data,null);
		}
		else{
			DoubleLinkedList current = head;
			while(current.next != null){
				current = current.next;
			}
			DoubleLinkedList newlink = new DoubleLinkedList(current, data, null);
			current.next = newlink;
			
		}
}
	public void RemoveRear(){
		if( head == null ) return;
		else{
			DoubleLinkedList current = head;
			//loop can be for current.next.next !=null
			
			while(current.next != null){
				current = current.next;
			}
			current.prev.next = null;
		}
	}
	
	public void addMiddle(int data, int index){
		
		if(head == null) return;
		else{
			DoubleLinkedList current = head;
			int i = 1 ; 
			while (i<index){
				current = current.next;
				i++;
			}
			DoubleLinkedList newlink = new DoubleLinkedList(current.prev, data, current);
			current.prev.next = newlink;
			current.prev = newlink;
		}
		
	}
	public void removeMiddle(int index){
		if (head==null) return;
		else{
			DoubleLinkedList current = head;
			int  i = 1 ; 
			while (i< index){
				current = current.next;
				i++;
			}
			current.prev.next = current.next;
		}
	}
	
	public void Print(){
		DoubleLinkedList current = head;
		while(current != null){
			System.out.println(current.Data());
			current = current.next;
		}
	}
	public static void main(String args[]){
		BasicDoubleLinkedListMethods df = new BasicDoubleLinkedListMethods();
		df.addFront(25);
		df.addFront(7);
		df.addFront(5);
		df.addFront(15);
		df.addFront(13);
		df.addFront(19);
		df.addFront(17);
		df.Print();
		System.out.println("---------Add Rear--------------------");
		df.addRear(50);
		df.Print();
		System.out.println("-----------Removing Front------------------");
		df.RemoveFront();
		df.Print();
		System.out.println("----------Removing Rear-------------------");
		df.RemoveRear();
		df.Print();
		System.out.println("----------Adding Middle-------------------");
		df.addMiddle(6, 3);
		df.Print();
		System.out.println("----------Removing Middle-------------------");
		df.removeMiddle(4);
		df.Print();
	}
}
