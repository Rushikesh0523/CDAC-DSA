package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.addByposition(23, 1);//add at the head
		ob.addByposition(13,1);// add before first node
		ob.addByposition(15,2 );//add in between
		ob.addByposition(25, 4);//after last node
		ob.displayall();
		ob.addByposition(21, 3);//after last node
		ob.addByposition(22, 2);//after last node
		ob.addByposition(45, 4);//after last node
		ob.displayall();
		ob.deletebypos(3);
		ob.displayall();
		ob.deletebypos(1);
		ob.displayall();
		ob.deletebypos(5);
		ob.displayall();
		

	}

}
