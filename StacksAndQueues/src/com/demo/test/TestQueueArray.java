package com.demo.test;

import com.demo.stacks.QueueArray;

public class TestQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		QueueArray que = new QueueArray(5);
		
		que.enqueue(15);
		que.enqueue(10);
		que.enqueue(7);
		que.enqueue(3);
		que.enqueue(6);
		que.enqueue(5);
		
		que.displayAll();
		
		while(!que.isEmpty()) {
			System.out.println(que.dequeue());
		}
		
		
		
		
		
		
		
		
	}

}
