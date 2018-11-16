package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Height {

	public static void main(String[] args) {
		BasicTreeMethods tree = new BasicTreeMethods();
		TreeNode root = tree.createTree();
		System.out.println(findHeight(root));
		System.out.println(findHeight2(root));
		System.out.println(recursiveHeight(root));
	}
	  static int findHeight(TreeNode aNode) {
		    if (aNode == null) {
		        return -1;
		    }

		    int lefth = findHeight(aNode.left);
		    int righth = findHeight(aNode.right);

		    if (lefth > righth) {
		        return lefth + 1;
		    } else {
		        return righth + 1;
		    }
		}
	  
	static int findHeight2(TreeNode root){
		TreeNode current = root;
		int height = -1;
		Queue q = new LinkedList<TreeNode>();
		q.add(current);
		
		while(true){
			
			int nC = q.size();
			if(nC == 0) return height;
			height++;
			
			while(nC > 0){
				TreeNode curr = (TreeNode) q.remove();
				if(curr.left != null) q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
				nC--;
			}
		}
		
	}
	
	static int recursiveHeight(TreeNode root) {
		if(root == null) return -1;
		
		int left = recursiveHeight(root.left);
		int right = recursiveHeight(root.right);
		
		return Math.max(left, right) + 1;
	}
	
}
