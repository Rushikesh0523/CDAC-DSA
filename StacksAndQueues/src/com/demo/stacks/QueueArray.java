package com.demo.stacks;

public class QueueArray {

	int [] arr;
	int front;
	int rear;
	
	public QueueArray(int size) {
		super();
		arr = new int[size];
		front=-1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		
		if(front==-1) {
			System.out.println("Queue is Empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1) {
			System.out.println("Queue is Full");
			return true;
		}
		return false;
	}
	
	
	public void enqueue(int val) {
		if(!isFull()) {
			rear++;
			arr[rear] = val;
			if(front==-1) {
				front++;
				
			}
		}
		else {
			System.out.println("Queue is full");
		}
		
	}
	
	
	public int dequeue() {
		
		if(!isEmpty()) {
			int n = arr[front];
			front++;
			if(front==arr.length) {
				front = -1;
			}
			return n;
		} 
		return -1;
		
	}
	
	public void displayAll() {
		
		for(int i: arr) {
			System.out.print(i + ",");
		}
		System.out.println("\n--------------------\n");
	}
	
	
	
	
	
	
	
	
	
	
}
