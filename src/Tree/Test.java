package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	boolean isFullTree(Node node) {
		if (node.left == null && node.right == null)
			return true;
		if ((node.left == null && node.right != null) || (node.left != null && node.right == null))
			return false;

		return isFullTree(node.left) && isFullTree(node.right);
	}

	public static boolean isSubtree(Tree T, Tree S) {
		// add code here.
		
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(S);
		Tree tree = T;
		while (!q.isEmpty()) {
			tree = q.remove();
			if (tree.data == T.data)
				break;
			if (tree.left != null)
				q.add(tree.left);
			if (tree.right != null)
				q.add(tree.right);
		}
		Queue<Tree> q1 = new LinkedList<Tree>();
		Queue<Tree> q2 = new LinkedList<Tree>();
		q1.add(S);
		q2.add(tree);

		while (!q1.isEmpty() && !q2.isEmpty()) {
			Tree t1 = q1.remove();
			Tree t2 = q2.remove();
			if (t1 == null && t2 == null)
				return true;
			if((t1==null && t2!=null)||(t1!=null && t2==null) )
				return false;
			if (t1.data != t2.data)
				return false;
			else {
				q1.add(t1.left);
				q1.add(t1.right);

				q2.add(t2.left);
				q2.add(t2.right);
			}
		}
		return true;
	}
}

class Tree {
	int data;
	Tree left, right;

	Tree(int d) {
		data = d;
		left = null;
		right = null;
	}
}

class Node {
	int data;
	Node left, right;
}
