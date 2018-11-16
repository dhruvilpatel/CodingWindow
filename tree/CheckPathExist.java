package tree;

public class CheckPathExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		System.out.println(pathExist(root, 1, 9 ));
		System.out.println(pathExist(root, 5, 1 ));		
	}	
	
	public static boolean pathExist(TreeNode root, int source, int target) {
		
		if(root == null) return false;
		if(root.data == source)
			return pathExistHelper(root, target);
		
		return pathExist(root.left, source, target) || pathExist(root.right, source, target);
	}
	
	public static boolean pathExistHelper(TreeNode root, int target) {
		if(root == null) return false;
		
		if(root.data == target) return true;
		return pathExistHelper(root.left, target) || pathExistHelper(root.right, target);
	}
}
