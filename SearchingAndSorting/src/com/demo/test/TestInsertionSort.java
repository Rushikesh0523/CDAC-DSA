package com.demo.test;

import com.demo.sorting.InsertionSortdemo;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		InsertionSortdemo.acceptdata(arr);
		InsertionSortdemo.displaydata(arr);
		InsertionSortdemo.insertionsortascending(arr);
		InsertionSortdemo.displaydata(arr);
		

	}

}
