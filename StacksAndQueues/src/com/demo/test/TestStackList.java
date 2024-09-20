package com.demo.test;

import com.demo.stacks.StackLinkedList;

public class TestStackList {

	public static void main(String[] args) {
		StackLinkedList<Integer> s=new StackLinkedList<>();
		s.push(10);
		s.push(5);
		s.push(13);
		s.push(20);
		s.displayData();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());


		
	}

}
