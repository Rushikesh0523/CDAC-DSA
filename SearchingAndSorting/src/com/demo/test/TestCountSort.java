package com.demo.test;

import com.demo.sorting.CountSortDemo;

public class TestCountSort {

	public static void main(String[] args) {
		int[] arr=new int[9];
		CountSortDemo.acceptdata(arr);
		CountSortDemo.displaydata(arr);
		int[] output=CountSortDemo.countSort(arr);
		CountSortDemo.displaydata(output);
	}

}
