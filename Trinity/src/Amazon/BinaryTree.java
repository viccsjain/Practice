package Amazon;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	Tree rootNode;

	public BinaryTree(Tree rootNode) {
		this.rootNode = rootNode;
	}

	public Tree getRootNode() {
		return rootNode;
	}

	public void setRootNode(Tree rootNode) {
		this.rootNode = rootNode;
	}

	public void preOrderTraversal(Tree node) {
		if (node == null)
			return;
		preOrderTraversal(node.getLeft());
		System.out.println(node.value);
		preOrderTraversal(node.getRight());
	}

	public void inOrderTraversal(Tree node) {
		if (node == null)
			return;
		System.out.println(node.value);
		inOrderTraversal(node.left);
		inOrderTraversal(node.right);

	}

	public Tree balancedTree(Tree parentNode, Tree node) {
		if (parentNode == null)
			return node;
		int parentValue = parentNode.getValue();
		int childValue = node.getValue();
		if (parentValue > childValue) {
			parentNode.left = balancedTree(parentNode.left, node);
		} else {
			parentNode.right = balancedTree(parentNode.right, node);
		}
		return parentNode;
	}

	public Tree minOrderNode(Tree parentNode) {
		Tree node = parentNode;
		if (parentNode.left != null)
			node = minOrderNode(parentNode.left);
		return node;
	}

	public int treeLeftHeight(Tree parentNode) {
		int count = 0;
		if (parentNode.left != null)
			return 1 + treeLeftHeight(parentNode.left);
		return 0;
	}

	public void traverseLeftRight(List<Tree> list) {
		if (list.size() == 0)
			return;
		List<Tree> tempList = new ArrayList<>();
		for (Tree tree : list) {
			System.out.println(tree.value);
			if (tree.left != null) {
				tempList.add(tree.left);
			}
			if (tree.right != null) {
				tempList.add(tree.right);
			}
		}
		traverseLeftRight(tempList);

	}

	public void printTree(List<Tree> list) {

		System.out.println();

		if (list.size() == 0)
			return;
		List<Tree> tempList = new ArrayList<>();
		for (Tree tree : list) {
			printNode(tree);
			if (tree.left != null) {
				tempList.add(tree.left);
			}
			if (tree.right != null) {
				tempList.add(tree.right);
			}
		}
		System.out.println();

		for (Tree tree : list) {
			printDash(tree);
		}
		printTree(tempList);

	}

	private void printNode(Tree parentNode) {
		int height = treeLeftHeight(parentNode);
		int distance = height * 4;
		for (int i = 0; i < distance; i++)
			System.out.print(" ");
		System.out.print(parentNode.value);
	}

	private void printDash(Tree parentNode) {
		int height = treeLeftHeight(parentNode);
		int distance = height * 4;
		if (parentNode.left != null) {
			for (int i = 0; i < distance - 2; i++)
				System.out.print(" ");
			System.out.print("/");
		}
		if (parentNode.right != null) {
			for (int i = 0; i < 4; i++)
				System.out.print(" ");
			System.out.print("\\");
		}

	}

	void topView(Tree root) {
		if (root == null)
			return;
		System.out.print(root.value + " ");
		topView(root.right);

	}

}
