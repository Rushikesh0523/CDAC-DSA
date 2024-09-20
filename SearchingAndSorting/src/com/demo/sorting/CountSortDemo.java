package com.demo.sorting;

import java.util.Scanner;

public class CountSortDemo {
	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr number");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displaydata(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
		
	}

	public static int[] countSort(int[] arr) {
		//find the maximum number
		int max=findMax(arr);
		//allocate memory for count array and initialize all values to 0
		
		int[] count=new int[max+1];
		for(int i=0;i<count.length;i++) {
			count[i]=0;
		}
		//[3  5 6 2 3]
		//find count of every value in arr
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		System.out.println("count array");
		displaydata(count);
		//find cumulative sum for all values
		for(int i=1;i<count.length;i++) {
			count[i]=count[i-1]+count[i];
		}
		System.out.println("cummulative sum");
		displaydata(count);
		//allocate memory for output array
		int[] output=new int[arr.length];
		//place arr in the output array based on values in the count array
		for(int i=0;i<arr.length;i++) {
			int pos=count[arr[i]]-1;
			output[pos]=arr[i];
			count[arr[i]]--;
		}
		return output;
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}

