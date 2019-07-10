package data.structure;

import java.util.Stack;

import data.structure.list.LinkedList;

public class Main {	
	public static void main(String[] args) {
		testLinkedList();
//		testStack();
	}
	
	private static void testStack() {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(10);
		stack.push(2);
		stack.push(7);
		stack.push(9);
		stack.push(8);
		stack.push(4);

		int size = stack.size();
		for (int i=0; i<size; i++)
			System.out.println(stack.pop());
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(4);

		size = stack.size();
		for (int i=0; i<size; i++)
			System.out.println(stack.pop());
	}
	private static void testLinkedList() {
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
