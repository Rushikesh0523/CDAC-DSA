package com.demo.stacks;

public class StackArray {
     int[] arr;
     int top; 
	public StackArray(int size) {
		super();
		this.arr =new int[size];
		top=-1;
	}
	public boolean isFull() {
		if(top==arr.length-1) {
			System.out.println("Stack overflow");
		
		}
		
		return top==arr.length-1;
	}
	public boolean isEmpty() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		return top==-1;
	}
	public void push(int val) {
		if(!isFull()) {
			top++;
			arr[top]=val;
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int n=arr[top];
			top--;
			return n;
		}
		return -1;
	}
     
	public void displaydata() {
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println("\n-------\n");
	}
}
