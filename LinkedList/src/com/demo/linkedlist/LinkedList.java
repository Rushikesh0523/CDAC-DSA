package com.demo.linkedlist;

public class LinkedList {
	public Node head;
	class Node{
		int data;
		Node next;
		public Node() {
			data=0;
			next=null;
		}
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public void addNodebyposition(int val,int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			//create a new node
			Node newNode=new Node(val);
			//add at the first position, means before head
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				//otherwise add at the given position
				Node temp=head;               
				for(int i=0;temp!=null && i<pos-2;i++) {
					temp=temp.next;
				}
				//adding the node after temp, 
				//i.e at the particualr position
				if(temp!=null) {
				   newNode.next=temp.next;
				   temp.next=newNode;
				}
			}
		}
	}
	
	public void addByValue(int val, int val1) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			//create a new node
			Node newNode=new Node(val);
			Node temp=head;
			//place the temp at the node, whose value matches
			while(temp.data!=val1) {
				temp=temp.next;
			}
			//add node after temp
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode.next;
			}
		}
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		//add at the first position if the list is empty
		if(head==null) {//list is empty
			head=newNode;
		}else { //add at the end
			Node temp=head;
			//this loop will place the temp at the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public  int deleteNodeByPos(int pos) {
		int n=-1;
		if(head==null) {
			System.out.println("list is empty");
		}
		else if(pos==1) {
			Node temp=head;
			head=head.next;
			temp.next=null;
			n=temp.data;
			temp=null;
		}
		else {
			Node temp=head;
			Node prev=null;
			//place temp at the node the one you want to delete
			// and prev should be at the node one befor temp
			for(int i=0;temp!=null && i<pos-1;i++) {
				prev=temp;
				temp=temp.next;
			}
			//delete the node at temp 
			if(temp!=null) {
		       prev.next=temp.next;
		       temp.next=null;
		       n=temp.data;
		       temp=null;
			}else {
				System.out.println("not found");
			}
		}
		return n;
		
	}
    public void deleteByValue(int val) {
    	Node temp=head;
    	Node prev=null;
    	//delete head node. 
    	if(head.data==val) {
    		head=head.next;
    		temp.next=null;
    		temp=null;
    	}else {
    		//place atem at the node to delete, 
    		//and prev before that node
    		while(temp!=null && temp.data!=val  ) {
    			prev=temp;
    			temp=temp.next;
    		}
    		//delete the node temp
    		if(temp!=null) {
	    		prev.next=temp.next;
	    		temp.next=null;
	    		//garbage collectio will pick up unreferenced node
	    		temp=null;  
    		}else {
    			System.out.println("not found");
    		}
    		
    	}
    }
    
	public void displaydata() {
		if(head==null) {
			System.out.println("list is empty");
		}
		for(Node temp=head;temp!=null;temp=temp.next) {
			System.out.print(temp.data+",");
		}
		System.out.println("\n--------------------\n");
	}
	public void displayevenData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			for(;temp!=null;temp=temp.next) {
				if(temp.data%2==0) {
					System.out.println(" data :"+temp.data);
				}
			}
		}
	}
	

}
