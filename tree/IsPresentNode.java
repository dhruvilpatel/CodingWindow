package tree;

public class IsPresentNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int isPresent(TreeNode root, int val) {
			if(root == null) return 0;
			
			while(root != null) {
				if(val == root.data) return 1;
				else if(val < root.data){
		            root = root.left;
		        }else{
		        	root = root.right;
		        }
			}
			
		return 0;
	}
}
