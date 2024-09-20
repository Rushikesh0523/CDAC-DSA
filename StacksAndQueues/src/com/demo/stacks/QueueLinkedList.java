package com.demo.stacks;

public class QueueLinkedList {

	Node front = null;
	Node rear = null;
	
	class Node {
		int data;
		Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		
		if(front==null) {
			System.out.println("Queue is Empty");
			return true;
		}
		return false;
			
	}
	
	public void enqueue(int val) {
		
		Node newNode = new Node(val);
		if(isEmpty()) {
			rear = newNode;
			front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Added Successfully");	
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int n = front.data;
			if(rear==front) {
				front=null;
				rear = null;
			}
			else {
				Node temp = front;
				front = front.next;
				temp.next = null;
				temp= null;
			}
			return n;
		}
		System.out.println("Queue is Empty");
		return -1;
	}
	
	public void displayAll() {
		Node temp = front;
		for(; temp!=null; temp = temp.next) {
			System.out.print(temp.data + ",");
		}
		System.out.println("\n----------------------------\n");
	}
	
	
	
	
	
	
	
	
	
	
}
