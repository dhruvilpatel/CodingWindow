package tree;

public class DFS {
	
	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		dfs(root);
	}
	
	static void dfs(TreeNode curr){
		
		if(curr == null) return;
		curr.visited = true;
		System.out.print(curr.data + " ");
		
		 dfs(curr.left);
		 dfs(curr.right);
		
	}
}
