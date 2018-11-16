package tree;

import java.util.Stack;

public class InOrder {
	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		iterativeInoder(root);
	}
	
	static void iterativeInoder(TreeNode root){
		System.out.print("Inorder Iterative: ");
		
		TreeNode current = root;
		
		Stack st = new Stack();
		while(!st.isEmpty() || current != null){
			
			if(current != null){
				st.push(current);
				current = current.left;
			}
			else{
				TreeNode t = (TreeNode) st.pop();
				System.out.print(t.data + " ");
				current = t.right;
			}
			
			
		}
		System.out.println("");
	}
	
}
