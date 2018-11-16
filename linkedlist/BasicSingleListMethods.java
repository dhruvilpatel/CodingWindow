package linkedlist;

public class BasicSingleListMethods {
		static BasicSingleListMethods sf  =  new BasicSingleListMethods();
		static SingleLinkedList head;

		int size ;
		public BasicSingleListMethods(){
			head = null;
			size = 0;
		}
		
		public static void addRear(int value){
			
			if(head == null){
				head = new SingleLinkedList(value);
			}
			else{
			SingleLinkedList current = head;
			while(current.next != null){
				current = current.next;
			}
			SingleLinkedList newlink = new SingleLinkedList(value, null);
			current.next = newlink;
			}
		}
		public void Print(){
			SingleLinkedList current = head;
			while(current != null){
				System.out.println(current.data);
				current = current.next;
			}
		}
		
		public static void main (String args[]){
			
			sf.addRear(1);
			sf.addRear(2);
			sf.addRear(3);
			sf.addRear(4);
			sf.addRear(5);
			sf.addRear(6);
			sf.addRear(7);
			
			sf.Print();
		}
}
