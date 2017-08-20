package Amazon;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeImplementation {
	
	class Node{
		Node left;
		Node right;
		int data;
	}
	
	 boolean checkBST(Node root) {
	        if(root == null)
	            return true;
	        if(root.left == null && root.right == null){
	            return true;
	        }
	        if(root.left == null){
	            if(root.data < root.right.data)
	                return checkBST(root.right);
	            else
	                return false;
	        }else if(root.right == null){
	            if(root.data > root.left.data)
	                return checkBST(root.left);
	            else
	                return false;
	        }else{
	            if(root.data < root.right.data && root.data > root.left.data){
	                return checkBST(root.right) && checkBST(root.left);
	            }else{
	                return false;
	            }
	        }
	    }

	public static void main(String[] args) {
		/*Tree rootNode = new Tree(10);
		BinaryTree mainNode = new BinaryTree(rootNode);
		rootNode.setLeft(new Tree(11));
		rootNode.setRight(new Tree(12));
		rootNode.getLeft().setLeft(new Tree(9));

		mainNode.preOrderTraversal(rootNode);
		System.out.println("----------");
		mainNode.inOrderTraversal(rootNode);
		System.out.println("----------");*/
		
		
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		Tree rootNode2 = new Tree(scanner.nextInt());
		BinaryTree binaryTree = new BinaryTree(rootNode2);
		for(int i=0;i<total-1;i++){
			rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(scanner.nextInt()));
		}
		binaryTree.inOrderTraversal(rootNode2);
		binaryTree.topView(rootNode2);
		
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(13));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(3));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(18));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(33));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(1));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(17));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(23));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(5));
//		rootNode2 = binaryTree.balancedTree(rootNode2, new Tree(8));
//		System.out.println("Pre order traversal");
//		binaryTree.inOrderTraversal(rootNode2);
//		System.out.println("----------");
//		System.out.println("Root Node " + rootNode2);
//		System.out.println(binaryTree.minOrderNode(rootNode2.getRight()));
//		System.out.println("Tree left height " + binaryTree.treeLeftHeight(rootNode2));
//		java.util.List<Tree> temp = new ArrayList<>();
//		temp.add(rootNode2);
//		binaryTree.traverseLeftRight(temp);
//		binaryTree.printTree(temp);
//		System.out.println("-------------");
		//binaryTree.printTree(rootNode2);
		

	}

}
