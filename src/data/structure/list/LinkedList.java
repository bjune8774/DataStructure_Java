package data.structure.list;

public class LinkedList<T> {
	private int mSize = 0;
	private Node mHeadNode = null;
	private Node mTailNode = null;

	public void add(T data) {
		if (isEmpty()) {
			mHeadNode = new Node(data);
			mTailNode = mHeadNode;
		} else {
			mTailNode.next = new Node(data);
			mTailNode = mTailNode.next;
		}
		mSize++;
	}

	public void insert(T data, int position) {
		if(isEmpty() || mSize < position + 1) {
			return;
		}
		
		if (position == 0) {
			Node node = new Node(data);
			node.next = mHeadNode.next;
			mHeadNode.next = null;
			mHeadNode = node;			
		} else {
			Node newNode = new Node(data);
			Node prevNode = get(position-1);
			newNode.next = prevNode.next;
			prevNode.next = newNode;		
			if (position == mSize) {
				mTailNode = newNode;
			}
		}
	}
	
	public void remove(int position) {
		if(isEmpty() || mSize < position + 1) {
			return;
		}
		
		if (position == 0) {
			Node node = mHeadNode;
			mHeadNode = mHeadNode.next;
			node.next = null;
			node = null;			
		} else {
			Node prevNode = get(position-1);
			Node remNode = prevNode.next;
			prevNode.next = remNode.next;
			remNode.next = null;
			remNode = null;
			if (position == mSize) {
				mTailNode = prevNode;
			}
		}
	}
	
	
	public Node get(int position) {
		Node node = mHeadNode;
		for (int i = 0; i < position; i++) {
			node = node.next;
		}
		
		return node;
	}

	public T getTailValue() {
		if (isEmpty()) {
			return null;
		}
		return mTailNode.data;
	}

	public T getHeadValue() {
		if (isEmpty()) {
			return null;
		}
		return mHeadNode.data;
	}

	public void print() {
		if (isEmpty()) {
			return;
		}

		Node node = mHeadNode;
		do {
			System.out.println(node.data);
			node = node.next;
		} while (node != null);

	}

	public boolean isEmpty() {
		return mHeadNode == null;
	}

	private class Node {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}
	}

}
