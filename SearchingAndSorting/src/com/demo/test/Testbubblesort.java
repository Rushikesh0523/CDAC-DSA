package com.demo.test;

import com.demo.sorting.BubblesortDemo;

public class Testbubblesort {
public static void main(String[] args) {
	int[] arr=new int[5];
	BubblesortDemo.acceptData(arr);
	BubblesortDemo.displayData(arr);
	BubblesortDemo.improvedsortdataascending(arr);
	BubblesortDemo.displayData(arr);
	//BubblesortDemo.sortdatadescending(arr);
}
}
