package data.structure;

import data.structure.list.LinkedList;
import data.structure.stack.Stack;
import data.structure.tree.BinarySearchTree;

public class Main {	
	public static void main(String[] args) {
//		testLinkedList();
//		testStack();
		testBST();
	}
	
	private static void testBST() {
		System.out.println("---------- Binary Search Tree Test ----------");
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(10);
		bst.insert(2);
		bst.insert(7);
		bst.insert(9);
		bst.insert(8);
		bst.insert(4);
		bst.print();
		System.out.println("---------------------");
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.push(40);
//		stack.print();
	}
	
	private static void testStack() {
		System.out.println("---------- Stack Test ----------");
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(10);
		stack.push(2);
		stack.push(7);
		stack.push(9);
		stack.push(8);
		stack.push(4);
		stack.print();
		System.out.println("---------------------");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(40);
		stack.print();
	}
	
	private static void testLinkedList() {
		System.out.println("---------- Linked List Test ----------");
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(4);
		list.insert(100, 0);
		list.insert(101, 1);
		list.insert(105, 5);
		list.print();
		
		System.out.println("---------------------");
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(4);
		list.print();
		
		list.add(50);
		list.add(20);
		list.add(30);
		list.print();
	}
}
