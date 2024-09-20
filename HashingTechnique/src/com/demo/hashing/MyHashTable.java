package com.demo.hashing;

import org.w3c.dom.Node;

public class MyHashTable {
	Node[] heads;
	public MyHashTable(int size) {
		heads=new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public void insertdata(int num){
		Node newNode=new Node(num);
		int pos=num%heads.length;
		if(heads[pos]==null) {
			heads[pos]=newNode;
		}else {
			newNode.next=heads[pos];
			heads[pos]=newNode;
		}
	}
	public boolean searchdata(int num) {
		int pos=num%heads.length;
		if(heads[pos]==null) {
			System.out.println("The bucket is empty, not found");
			return  false;
		}else {
			for(Node temp=heads[pos];temp!=null;temp=temp.next) {
				if(temp.data==num) {
					System.out.println("Number found-->"+num);
					return true;
				}
			}
			System.out.println("number not found");
			return false;
		}
	}
	
	public void displaydata() {
		for(int i=0;i<heads.length;i++) {
			System.out.print(i+"---->");
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.print("null\n");
		}
		
	}

}






