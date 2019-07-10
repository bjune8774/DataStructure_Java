package data.structure.stack;


public class Stack<T> {
	private Node mTopNode;
	
	public void push() {
		
	}
	
	public void pop() {
		
	}
	
	private class Node {
		public T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
}
