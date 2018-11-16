package tree;

import java.util.ArrayList;

// Blackrock
public class CommonAncestor {

	static ArrayList<Integer> al = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		Euler(root);
		
		for(int x: al) {
			System.out.println(x);
		}
		
	}

	static TreeNode commonAncestor(TreeNode root, int p, int q){
		
		if(root == null)return null;
		if (root.data == p || root.data == q) return root;
		TreeNode l = commonAncestor(root.left, p ,q);
		TreeNode r = commonAncestor(root.right, p, q);
		
		if(l == null && r == null) return null;
		else if( l != null && r != null) return root;
		else return l != null ? l : r;
	}
	
	static void Euler(TreeNode root) {
		if(root == null) return;
		al.add(root.data);
		Euler(root.left);
		al.add(root.data);
		Euler(root.right);
		
	}
	
}
