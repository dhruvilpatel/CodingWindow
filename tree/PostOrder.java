package tree;

import java.util.Stack;

public class PostOrder {

	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		iterativePostorder(root);
	}
	
	static void iterativePostorder(TreeNode root){
		
		TreeNode current = root;
		Stack st1= new Stack();
		Stack st2= new Stack();
		st1.push(current);
		while(!st1.isEmpty()){
			
			TreeNode top = (TreeNode) st1.pop();
			st2.push(top);
			
			if(top.left != null) st1.push(top.left);
			if(top.right != null) st1.push(top.right);
			
		}
		System.out.print("Postorder Iterative: ");
		while(!st2.isEmpty()){
			
			TreeNode top = (TreeNode) st2.pop();
			System.out.print(top.data + " ");
			
		}
		System.out.println("");
		
	}
}
