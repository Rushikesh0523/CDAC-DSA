package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.addNodebyPosition(10, 1);
		c.displayData();
		c.addNodebyPosition(5, 1);
		c.displayData();
		c.addNodebyPosition(6, 2);
		c.displayData();
		c.addNodebyPosition(7, 4);
		c.displayData();
		//c.deleteByPosition(1);//delete first node
		//c.displayData();
		c.deleteByPosition(2);//delete in between 
		c.displayData();
		c.deleteByPosition(3);//delete the last node
		c.displayData();

	}

}
