package com.demo.test;

import com.demo.stacks.QueueLinkedList;

public class TestQueueLinkedList {

	public static void main(String[] args) {
		
		QueueLinkedList que = new QueueLinkedList();
		
		que.enqueue(15);
		que.enqueue(10);
		que.enqueue(7);
		que.enqueue(20);
		
		que.displayAll();
		
		while(!que.isEmpty()) {
			System.out.println(que.dequeue());
		}
		
		
		
		
		
		
	}
}
