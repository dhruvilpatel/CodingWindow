package tree;

import java.util.LinkedList;
// Paypal
import java.util.Queue;

import linkedlist.Node;

public class GenerateBinaryTreeFromList {
	// A -> B -> C -> D -> E -> F
	//
	// A
	// / \
	// B C
	// / \ /
	// D E F

	public TreeNode convertTree(Node head) {

		if (head == null) {

			return null;
		}
		TreeNode root = new TreeNode(head.data); // A

		Queue<Integer> q = new LinkedList<Integer>();

		if (head.next != null) {
			head = head.next; // B
			q.add(head.data);
		} else {
			return root;
		}
		while (head != null) {

			TreeNode parent = new TreeNode(q.poll());

			TreeNode leftChild = new TreeNode(head.data);
			q.offer(leftChild.data);
			parent.left = leftChild;

			head = head.next; // C
			TreeNode rightChild = new TreeNode(head.data);
			q.offer(rightChild.data);
			parent.right = rightChild;

		}

		return root;
	}
}
