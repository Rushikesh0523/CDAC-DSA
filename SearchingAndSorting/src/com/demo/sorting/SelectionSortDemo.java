package com.demo.sorting;

import java.util.Scanner;

public class SelectionSortDemo {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter number");
			arr[i]=sc.nextInt();
		}
		
	}
	public static void displaydata(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"--->"+arr[i]);
		}
		System.out.println("-------------------------------------");
		
	}
	public static void sortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//it will find the next minimum number
			int minidx=findMinnum(arr,i,arr.length);
			//swap the smallest element at ith position
			int temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
					
		}
		
	}
	
	private static int findMinnum(int[] arr, int start, int end) {
		int min=arr[start];
		int minidx=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minidx=i;
				
			}
		}
		return minidx;
	}
	public static void sortdescending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int maxidx=findmax(arr,i,arr.length);
			int temp=arr[i];
			arr[i]=arr[maxidx];
			arr[maxidx]=temp;
		}
		
	}
	private static int findmax(int[] arr, int start, int end) {
		int max=arr[start];
		int maxidx=start;
		for(int i=start;i<end;i++) { //O(n)
			if(arr[i]>max) {
				max=arr[i];
				maxidx=i;
			}
		}
		return maxidx;
	}
	
	public static int findnthmax(int[] arr,int num){
		int maxidx=-1;
		for(int i=0;i<num;i++) {  
			 maxidx=findmax(arr,i,arr.length);
		}
		return arr[maxidx];
		
	}
	
	
	

}
