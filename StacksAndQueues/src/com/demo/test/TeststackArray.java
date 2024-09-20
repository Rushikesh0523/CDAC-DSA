package com.demo.test;

import com.demo.stacks.StackArray;

public class TeststackArray {

	public static void main(String[] args) {
		StackArray s=new StackArray(5);
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(35);
		s.push(50);
		s.displaydata();
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
