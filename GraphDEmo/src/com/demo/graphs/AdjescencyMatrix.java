package com.demo.graphs;

import java.util.Scanner;

public class AdjescencyMatrix {
	int[][] graph;
	public AdjescencyMatrix(int num) {
		graph=new int[num][num];
	}
	
	public void addgraph() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++) {
				System.out.println("edge "+i+"--->"+j+": ");
				graph[i][j]=sc.nextInt();
			}
			
		}
	}
	
	public void displaydata() {
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++) {
				System.out.print(graph[i][j]+"\t");
			}
			System.out.println();
			
		}
	}

}
