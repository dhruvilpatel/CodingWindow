package tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumToGivenValue {
	static ArrayList<Integer> check = new ArrayList<Integer>();
	int x = 500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = BasicTreeMethods.createTree();
		System.out.println(pathSumExist(root, 8));
		System.out.println(pathSumRootToLeaf(root, 9));
		check.add(root.data);
		System.out.println(printPath(root, 11 - root.data, new ArrayList<Integer>(root.data))); 
		System.out.println(printAllPathsRootToLeaf(root, new ArrayList<Integer>(), new ArrayList<List<Integer>>())); 
		System.out.println(check);
	}

	public static  boolean pathSumRootToLeaf(TreeNode root, int sum) {
		
		if(root == null) return sum == 0;
		sum -= root.data;
		if(sum == 0 && root.left == null && root.right == null) return true;
		boolean ans = false;
		
		ans = ans || pathSumExist(root.left, sum);
		ans = ans || pathSumExist(root.right, sum);
		
		return ans;
	}
	
	public static List<List<Integer>> printAllPathsRootToLeaf(TreeNode root, List<Integer> ls, List<List<Integer>> result){
		if(root == null) return null;
		
		if(root.left == null && root.right == null) {
			ls.add(root.data);
			result.add(new ArrayList<Integer>(ls));
			return result;
		}
		ls.add(root.data);
		if(root.left != null) {
			printAllPathsRootToLeaf(root.left, ls, result);
			ls.remove(ls.size() - 1);
		}
		if(root.right != null) {
			printAllPathsRootToLeaf(root.right, ls, result);
			ls.remove(ls.size() - 1);
		}
		
		return result;
	}
	
	public static boolean pathSumExist(TreeNode root, int sum) {
		if(root == null)return false;
		
		if(sum == 0) return true;
		
		sum -= root.data;
		
		return pathSumExist(root.left, sum) || pathSumExist(root.right, sum);
		
	}
	
	public static List<Integer> printPath(TreeNode root, int sum, ArrayList<Integer> answer){
				   
		if(sum == 0 && root.right == null && root.left == null) {
			check.addAll(new ArrayList<Integer>(answer));
			return answer;
		}

		
		if( root.left != null) {
			sum -= root.left.data;
			answer.add(root.left.data);
			printPath(root.left, sum, answer);
			if(answer.size()>0) answer.remove(answer.size() - 1);
		}
		if(root.right != null) {
			sum -= root.right.data;
			answer.add(root.right.data);
			printPath(root.right, sum, answer);
			if(answer.size()>0) answer.remove(answer.size() -1);
		}
		return answer;
	}
	
}
