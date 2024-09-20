package com.demo.test;

import com.demo.sorting.HeapSortDemo;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr=new int[9];
		HeapSortDemo.acceptdata(arr);
		HeapSortDemo.displaydata(arr);
		HeapSortDemo.heapSort(arr);
		HeapSortDemo.displaydata(arr);

	}

}
