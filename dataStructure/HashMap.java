package dataStructure;

public class HashMap {
	int buffersize = 10;
	innerArray[] externalArray;
	public HashMap(){
		externalArray = new innerArray[buffersize];
	}
	
	public HashMap(int x){
		buffersize = x;
		externalArray = new innerArray[x];
	}
	
	class innerArray{
		int[] arr;
		public innerArray(){
			 arr = new int[10];
		}
		
	}
	public void put(int key, int value){
		
		int index = key % buffersize;
		if(externalArray[index] == null){
			System.out.println("Empty index. Hence generating new");
			innerArray iA = new innerArray();
			iA.arr[0] = value;
			externalArray[index] = iA;
		}
		
	}
	
	
	public int get(int key){
		
		int index = key % buffersize;
		if(externalArray[index] != null){
			innerArray iA = externalArray[index];
			for(int i = 0 ; i < iA.arr.length; i++){
				if(iA.arr[i] == key){
					System.out.println(Integer.toString(key) + Integer.toString(iA.arr[i]));
					return iA.arr[0];
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		hm.put(1,5);
		System.out.println(hm.get(1));
	}


}