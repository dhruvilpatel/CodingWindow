package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		bfs(root);
	}
	
	static void bfs(TreeNode root){
		TreeNode current = root;
		System.out.print("BFS: ");
		Queue q = new LinkedList();
		q.add(current);
		current.visited = true;
		
		while(!q.isEmpty()){
			TreeNode top = (TreeNode) q.remove();
			System.out.print(top.data + " ");
			if(top.left != null) q.add(top.left);
			if(top.right != null) q.add(top.right);
			
			
		}
		System.out.println("");
	}
	
}
