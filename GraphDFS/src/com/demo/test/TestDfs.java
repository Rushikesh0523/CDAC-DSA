package com.demo.test;

import com.demo.graphs.AdjescencyList;

public class TestDfs {

	public static void main(String[] args) {
		AdjescencyList graph=new AdjescencyList(7);
		graph.addGraph();
		graph.displaydata();
		graph.dfsTraversal(0);
		//graph.bfsTraversal(0);

	}

}