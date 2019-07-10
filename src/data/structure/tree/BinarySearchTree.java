package data.structure.tree;

public class BinarySearchTree {
	private Node mRootNode;

	public void insert(int data) {
		mRootNode = insertNode(mRootNode, data);
	}

	private Node insertNode(Node node, int data) {
		if (node == null) {
			return new Node(data);
		} else if (node.data > data) {
			node.left = insertNode(node.left, data);
		} else if (node.data < data) {
			node.right = insertNode(node.right, data);
		}
		return node;
	}

	public void print() {
		if (isEmpty()) {
			return;
		}

		printNode(mRootNode);
	}

	private void printNode(Node node) {
		if (node != null) {
			System.out.println(node.data);
			printNode(node.left);
			printNode(node.right);
		}
	}

	public boolean isEmpty() {
		return mRootNode == null;
	}

	private class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
