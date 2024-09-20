package com.demo.test;

import com.demo.sorting.QuicksortDemo;

public class TestQuickSort {
	public static void main(String[] args) {
		 int[] arr=new int[9];
		 QuicksortDemo.acceptData(arr);
		 QuicksortDemo.displayData(arr);
		 QuicksortDemo.quicksort(arr,0,arr.length-1);
	}
  
   
}
