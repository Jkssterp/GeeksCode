package com.prolifics.adm.jkstuff.geeks4geeks;

/**
 * Here is a simple Binary Search Tree program in which only insertion and
 * in-order traversal was performed
 * 
 * @author jayakrishna_gujju
 *
 */

public class BinaryTree {

	// make a private class for Node which have three properties
	private static class Node {
		int data;
		Node next;
		Node prev;
	}

	/**
 	*  In-Order displays in Left Data Right(LDR) format
 	*  
 	* @param root
 	*/
	public static void displayInorder(Node root) {
		if (root == null) {
			return;
		}
		displayInorder(root.prev);
		System.out.print(root.data + ", ");
		displayInorder(root.next);
	}
	
	/**
	 * Pre-Order displays in Data Left Right(DLR) format
	 * 
	 * @param root
	 */
	public static void displayPreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		displayPreorder(root.prev);
		displayPreorder(root.next);
	}
	
	/**
	 * Pre-Order displays in Left Right Data(LRD) format
	 * 
	 * @param root
	 */
	public static void displayPostorder(Node root) {
		if (root == null) {
			return;
		}
		displayPostorder(root.prev);
		displayPostorder(root.next);
		System.out.print(root.data + ", ");
	}
	
	/**
	 * Returns the minimum value in the Binary Search Tree.
	 */
	public static int findMinimum(Node root) {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.prev != null) {
			currNode = currNode.prev;
		}
		return currNode.data;
	}

	/**
	 * Returns the maximum value in the Binary Search Tree
	 */
	public static int findMaximum(Node root) {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		return currNode.data;
	}
	
	public Node insert(Node newNode, Node root) {
		if (root == null) {
			root = newNode;
			return root;
		}
		if (root.data <= newNode.data)
			root.next = insert(newNode, root.next);
		else if (root.data > newNode.data)
			root.prev = insert(newNode, root.prev);
		return root;

	}

	public static Node makeNode(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		n.prev = null;
		return n;
	}

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		Node root = null;// each time we have to modified our root value
		root = bt.insert(makeNode(11), root);// because it is local
		root = bt.insert(makeNode(10), root);
		root = bt.insert(makeNode(13), root);
		root = bt.insert(makeNode(5), root);
		root = bt.insert(makeNode(7), root);
		root = bt.insert(makeNode(12), root);

		System.out.println("In-Order");
		displayInorder(root);
		System.out.println("\nPre-Order");
		displayPreorder(root);
		System.out.println("\nPost-Order");
		displayPostorder(root);
		System.out.println("\nFind Minimum "+findMinimum(root));
		System.out.println("\nFind Maximum "+findMaximum(root));
	}
}
