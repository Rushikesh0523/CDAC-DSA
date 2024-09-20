package com.demo.linkedlist;

public class DoublyLinkedList {
	public Node head=null;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int val) {
			data=val;
			next=null;
			prev=null;
		}
	}
	
	public void addByposition(int val, int pos){
		//create a new node
		Node newNode=new Node(val);
		// add at the head if list is empty
		if(head==null) {
			System.out.println("list is empty");
			head=newNode;
		}else {
			if(pos==1) {
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}else {
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {// add in between or at the end
					newNode.next=temp.next;
					newNode.prev=temp;
					//adding in between
					if(temp.next!=null) {
						temp.next.prev=newNode;
					}
					temp.next=newNode;
				}
			}
		}
	}
	public void deletebypos(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			if(pos==1) {
				Node temp=head;
				head=head.next;
				temp.next=null;
				temp.prev=null;
				temp=null;
				
			}else {
				Node temp=head;
				for(int i=0;temp!=null && i<pos-1;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					temp.prev.next=temp.next;
					if(temp.next!=null) {
					   temp.next.prev=temp.prev;
					}
					   temp.next=null;
					   temp.prev=null;
					   temp=null;
					
				}
			}
		}
	}
	
	public void displayall() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+",");
			}
			System.out.println("\n-------------------\n");
		}
	}
	
	public void displayReverse() {
		
	}

}
