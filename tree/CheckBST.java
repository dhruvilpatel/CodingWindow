package tree;

public class CheckBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		System.out.println(isBST(root));
	}

	
	
	public static boolean isBST(TreeNode root) {
		if(root == null) return true;
		
		return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}
	
	public static boolean isBSTHelper(TreeNode root, int min, int max) {
		
		if(root == null) return true;
		
		if(root.data < min || root.data > max) {
			return false;
		}
		
		return isBSTHelper(root.left, min, root.data) && isBSTHelper(root.right, root.data, max);
		
	}
}
