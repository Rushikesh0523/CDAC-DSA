package com.demo.linkedlist;

public class CircularLinkedList {
	Node head=null;
	Node last=null;
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
		
	}
public void addNodebyPosition(int val,int pos) {
	Node newNode=new Node(val);
	//check if the list is empty
	if(head==null) {
		System.out.println("list is empty");
		head=newNode;
		last=newNode;
		newNode.next=head;
		
	}
	else {
		if(pos==1) {
			System.out.println("pos 1");
			newNode.next=head;
			head=newNode;
			last.next=head;
		}else {
			Node temp=head;
			for(int i=0;temp!=last && i<pos-2; i++) {
				temp=temp.next;
				System.out.println("in for");
			}
			newNode.next=temp.next;
			temp.next=newNode;
			if(temp==last) {
				last=newNode;
			}
		}
	}
}
	public void displayData() {
		Node temp=head;
		for(;temp!=last;temp=temp.next) {
			System.out.print(temp.data+",");
		}
		System.out.print(temp.data+",");
		System.out.println("\n----------\n");
	}

   public void deleteByPosition(int pos) {
	   if(head==null) {
		   System.out.println("list is empty");
	   }
	   else {
		   if(pos==1) {
			   //if only one node is in linked list
			   if(head==last) {
				   head=null;
				   last=null;
			   }else {//if more than one node in linked list
				   last.next=head.next;
				   Node temp=head;
				   head=head.next;
				   temp.next=null;
				   temp=null;
			   }
		   }else {
			   Node temp=head;
			   Node prev=null;
			   for(int i=0;temp!=last && i<pos-1;i++) {
				   prev=temp;
				   temp=temp.next;
			   }
			   prev.next=temp.next;
			   if(temp==last)
				   last=prev;
			   temp.next=null;
			   temp=null;
			   
		   }
	   }
   }








}
