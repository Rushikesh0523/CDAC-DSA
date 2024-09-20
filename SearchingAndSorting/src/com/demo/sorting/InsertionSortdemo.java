
+package com.demo.sorting;

import java.util.Scanner;

public class InsertionSortdemo {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr data");
			arr[i]=sc.nextInt();
		}
		
	}
	
	public static void displaydata(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---->"+arr[i]);
			
		}
		System.out.println("------------------------------");
		
	}

	public static void insertionsortascending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//value we want to insert into sorted portion
			int key=arr[i]; 
			//j is placed at end of sorted portion
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			displaydata(arr);
		}
		
	}
	

}
