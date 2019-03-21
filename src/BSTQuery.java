import java.util.Scanner;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BSTQuery {

	Node root;

	void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	int getCountOfNode(Node root, int l, int r) {
		if (root == null)
			return 0;

		if (root.key >= l && root.key <= r)
			return 1 + getCountOfNode(root.left, l, r) + getCountOfNode(root.right, l, r);
		return getCountOfNode(root.left, l, r) + getCountOfNode(root.right, l, r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			BSTQuery tree = new BSTQuery();
			for (int i = 0; i < n; i++) {
				tree.insert(sc.nextInt());
			}
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(tree.getCountOfNode(tree.root, l, r));
		}
		sc.close();
	}
}
