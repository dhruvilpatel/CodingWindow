package tree;

// Visa
public class CreateBST {
public static void main(String[] args){
		
		int[] arr = {3,2,1};
		createBST(arr);
	}
	static void createBST(int[] keys) {
        /*
         * Write your code here.
         */
        
        Node root = new Node(keys[0]);
        System.out.println(Node.counter);
        for(int i = 1; i < keys.length; i++){
            
            insert(root,keys[i]);
            System.out.println(Node.counter);
        }
    }

    static void insert(Node curr, int key){
        Node.counter++;
        if(key <= curr.value){
            if(curr.left == null) {
                Node n = new Node(key);
                curr.left = n;
            }else{
               insert(curr.left, key);
            }
        }else{
            if(curr.right == null){
                Node n = new Node(key);
                curr.right = n;
            }else{
                insert(curr.right, key);
            }
        }
    }
     static class Node{
    	static int counter = 0;
        Node left, right;
        int value;
        Node root;
        Node(int value){
            this.value = value;
        }
        
    }
}
