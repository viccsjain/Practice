package ThoughtWorks;

public class FindTreeHieght {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
	}

}

class BinaryTree {
	Node root;

	public int maxDepth(Node root2) {
		if (root2 == null)
			return 0;
		else
			return 1 + Math.max(maxDepth(root2.left), maxDepth(root2.right));
	}

	public boolean isBalanced(Node root2) {
		if (root2 == null)
			return true;
		else {
			return Math.abs(maxDepth(root2.left) - maxDepth(root2.right)) <= 1 && isBalanced(root2.left)
					&& isBalanced(root2.right);
		}

	}
}

// Java program to find height of tree

// A binary tree node
class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}