package com.demo.test;

import com.demo.sorting.MergesortDemo;

public class TestMergesort {

	public static void main(String[] args) {
		int[] arr=new int[12];
		MergesortDemo.acceptdata(arr);
		MergesortDemo.displaydata(arr);
		MergesortDemo.mergesort(arr,0,arr.length-1);
		MergesortDemo.displaydata(arr);
	}

}
