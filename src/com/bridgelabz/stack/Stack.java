package com.bridgelabz.stack;

import java.util.Arrays;

public class Stack {

	private static final int MAX = 10;
	private int[] arr;
	private int top;

	public Stack() {
		arr = new int[MAX];
		top = -1;
	}

	public Stack(int length) {
		this.arr = new int[length];
		top = -1;
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.println("Stack is overflow");
			return false;
		}

		arr[++top] = data;
		System.out.println("push data into stack");
		return true;
	}

	public boolean isFull() {
		return (top >= arr.length - 1);
	}

	public void display() {
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(" -> " + arr[i]);
		}
		System.out.println();

	}

}
