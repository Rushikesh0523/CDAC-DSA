package com.demo.test;

import com.demo.sorting.SelectionSortDemo;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		SelectionSortDemo.acceptdata(arr);
		SelectionSortDemo.displaydata(arr);
		SelectionSortDemo.sortAscending(arr);
		SelectionSortDemo.displaydata(arr);
		SelectionSortDemo.sortdescending(arr);
		SelectionSortDemo.displaydata(arr);
		int maxnnum=SelectionSortDemo.findnthmax(arr,4);
	}

}
