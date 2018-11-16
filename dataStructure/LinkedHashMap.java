package dataStructure;

public class LinkedHashMap {
	int bufferSize = 10;
	Node[] externalArray;
	public LinkedHashMap(){
		externalArray = new Node[bufferSize];
	}
	public LinkedHashMap(int size){
		externalArray = new Node[size];
	}

	class Node{
		int key;
		int value;
		Node next;
		
		public Node(int k, int v){
			this.key = k;
			this.value = v;
		}
		
		public void setKey(int k){
			this.key = k;
		}
		
		public int getKey(){
			return key;
		}
		
		public void setValue(int value){
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
		public Node getNext(){
			return next;
		}
	}
	
	
	public void put(int key, int value){
		
		Node entry = new Node(key, value);
		int index = key % bufferSize;
		
		if(externalArray[index] == null){
			externalArray[index] = entry;
		}
		else{
			Node current = externalArray[index];
			while(current.next != null){
				
				if(current.getKey() == key) {
					current.setValue(value);
					return;
				}	
				current = current.getNext();
			}	
			current.setNext(entry);
		}
		
	}
	
	public int get(int key){
		int index = key % bufferSize;
		
		if(externalArray[index] != null){
			Node current = externalArray[index];
			while(current != null){
				if(current.getKey() == key) {
					return current.getValue();
				}	
				current = current.getNext();
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(5,55);
		System.out.println(Integer.toString(lhm.get(5)));
		
	}

}
