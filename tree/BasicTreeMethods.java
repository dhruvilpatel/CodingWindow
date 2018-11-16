package tree;

public class BasicTreeMethods {

	static TreeNode root;
	public BasicTreeMethods(){
		root = null;
	
	}
	  void addNode(int data){
			TreeNode newlink = new TreeNode(data);

		if(root==null ){
			root = newlink;
			return;
		}
		else{
			TreeNode current = root;
			TreeNode parent = null;
			while(true){
				parent = current;
			if(data < current.data){
				
				current = current.left;
				if(current==null){
					parent.left = newlink;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newlink;
					return;
				}
			}
		}
			

			
		}
	}
	  
	  public static TreeNode createTree() {
		  BasicTreeMethods ts = new BasicTreeMethods();
			ts.addNode(5);
			ts.addNode(8);
			ts.addNode(3);
			ts.addNode(1);
			ts.addNode(2);
			ts.addNode(6);
			ts.addNode(9);
			
			return root;
	  }
	  public static void main(String args[]){
			
			createTree();
		
			}
}

