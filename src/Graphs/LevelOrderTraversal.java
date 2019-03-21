package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	void levelOrder(Node1 node) {
		// Your code here
		Queue<Node1> q = new LinkedList<Node1>();
		q.add(node);
		while (!q.isEmpty()) {
			Node1 node1 = q.peek();
			System.out.print(node1.data + " ");
			q.remove();
			// add child into the queue
			if (node1.left != null)
				q.add(node1.left);
			if (node1.right != null)
				q.add(node1.right);

		}
	}

}

class Node1 {
	int data;
	Node1 left = null;
	Node1 right = null;
}
