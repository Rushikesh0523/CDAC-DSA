package com.demo.graphs;

import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.stacks.StackLinkedList;

public class AdjescencyList {
      Node[] heads;
      public AdjescencyList(int num) {
    	  heads=new Node[num];
      }
      class Node{
    	  int data;
    	  Node next;
    	  public Node(int val) {
    		  data=val;
    		  next=null;
    	  }
      }
      
      public void addGraph() {
    	  Scanner sc=new Scanner(System.in);
    	  for(int i=0;i<heads.length;i++) {
    		  for(int j=0;j<heads.length;j++) {
    			  System.out.println("edge : "+i+ "---->"+j+": ");
    			  int num=sc.nextInt();
    			  if(num==1) {
    				  Node newNode=new Node(j);
    				  if(heads[i]==null) {
    					  heads[i]=newNode;
    				  }else {
    					  newNode.next=heads[i];
    					  heads[i]=newNode;
    				  }
    				  
    			  }
    		  }
    	  }
      }
      
      public void displaydata() {
    	  for(int i=0;i<heads.length;i++) {
    		  System.out.print(" Node "+i+":");
    		  for(Node temp=heads[i];temp!=null;temp=temp.next) {
    			  System.out.print(temp.data+"---->");
    			 
    		  }
    		  System.out.print("null\n");
    		  }
      }
      
      public void dfsTraversal(int n) {
    	  StackLinkedList<Integer> mystack=new StackLinkedList<Integer>();
    	  mystack.push(n);
    	  int[] mydfs=new int[heads.length];
    	  int cnt=0;
    	  boolean[] visited=new boolean[heads.length];
    	  for(int i=0;i<visited.length;i++) {
    		  visited[i]=false;
    	  }
    	  while(!mystack.isEmpty()) {
    		  int d=mystack.pop();
    		  if(!visited[d]) {
    			  //mark visited to true
    			  visited[d]=true;
    			  //add into dfs
    			  mydfs[cnt]=d;
    			  cnt++;
    			  //add non visited adjacency vertices in the stack
    			  for(Node temp=heads[d];temp!=null;temp=temp.next) {
    				 
    				  if(!visited[temp.data]) {
    					  mystack.push(temp.data);
    				  }
    			  }
    		  }
    		  
    	  }
    	  for(int n1:mydfs) {
    		  System.out.print(n1+",");
    	  }
    	  
      }
      
}
