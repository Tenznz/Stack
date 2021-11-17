package com.bridgelabz.stack;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack.isFull()); 
		stack.display();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.display();
	}
}
