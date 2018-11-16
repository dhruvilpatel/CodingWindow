package tree;

import java.util.Stack;

public class PreOrder {
	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		iterativePreorder(root);
	}
	
	static void iterativePreorder(TreeNode root){
		System.out.print("Iterative Preorder: ");
		TreeNode current = root;
		
		Stack st = new Stack();
		
		while(!st.isEmpty() || current != null){
			
			if(current != null){
				System.out.print(current.data + " ");
				st.push(current);
				current = current.left;
			}
			else{
				TreeNode top = (TreeNode) st.pop();
				current = top.right;
			}
			
			
		}
		System.out.println("");
	}
	
}
