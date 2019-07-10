package data.structure.stack;

public class Stack<T> {
	private Node mTopNode;
	
	public void push(T data) {
		if (isEmpty()) {
			mTopNode = new Node(data);
		} else {
			Node node = new Node(data);
			node.below = mTopNode;
			mTopNode = node;
		}
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		
		Node node = mTopNode;
		mTopNode = mTopNode.below;
		
		return node.data;
	}
	
	public void print() {
		if (isEmpty()) {
			return;
		}

		Node node = mTopNode;
		do {
			System.out.println(node.data);
			node = node.below;
		} while (node != null);

	}
	
	public boolean isEmpty() {
		return mTopNode == null;
	}
	
	private class Node {
		public T data;
		public Node below;
		
		public Node(T data) {
			this.data = data;
			this.below = null;
		}
	}
}
