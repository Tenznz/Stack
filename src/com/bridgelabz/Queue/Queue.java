package com.bridgelabz.Queue;

public class Queue {

	private int[] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;

	Queue(int size) {
		arr = new int[size];
		front = 0;
		rear = -1;
		capacity = size;
		count = 0;
	}

	void enQueue(int data) {

		if (isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			return;
		}

		System.out.println("adding " + data);

		rear = (rear + 1) % capacity;
		arr[rear] = data;
		count++;
	}

	private Boolean isFull() {
		return (size() == capacity);
	}

	public int size() {
		return count;
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " -> ");
		}

	}
}
