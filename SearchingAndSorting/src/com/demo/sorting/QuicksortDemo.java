package com.demo.sorting;

import java.util.Scanner;

public class QuicksortDemo {
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr number");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void 	
	displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
		
	}

	public static void quicksort(int[] arr, int start, int end) {
		if(start<end) {
			//partition will place pivot at proper position
			int p=partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
		}
	}
   /// 2 1 3 4 5 7 12 6
	private static int partition(int[] arr, int first, int last) {
		int pivot=first;
		int i=first;
		int j=last;
		while(i<j) {
		while(i<last && arr[i]<=arr[pivot])
			i++;
		while(j>pivot && arr[j]>arr[pivot])
			j--;
		if(i<j) {
			//swapping values at i and j position
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		//swap j and pivot
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		System.out.println("pivot"+arr[j]+" is placed at" +j +" position");
		displayData(arr);
		return j;
		
		
		
	}
}
