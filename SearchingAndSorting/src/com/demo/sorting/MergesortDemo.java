package com.demo.sorting;

import java.util.Scanner;

public class MergesortDemo {

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
		
	}

vf	public static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			System.out.println("left tree start: "+start+" end : "+mid);
			mergesort(arr,start,mid);
			System.out.println("right tree start: "+(mid+1)+" end : "+end);
			mergesort(arr,mid+1,end);
			System.out.println("merge start: "+start+"mid: "+mid+" end : "+end);
			merge(arr,start,mid,end);
		}
		
	}
   
	private static void merge(int[] arr, int start, int mid, int end) {
		//length of leftarray
		int n1=mid-start+1;
		//length of right array
		int n2=end-mid;
		
		//temporary arrays
		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];
		//copy data to temp array
		for( int i=0;i<n1;i++) {
			leftarray[i]=arr[start+i];
		}
		for( int i=0;i<n2;i++) {
			rightarray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i]<=rightarray[j]) {
				arr[k]=leftarray[i];
				k++;
				i++;
			}else {
				arr[k]=rightarray[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			arr[k]=leftarray[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k]=rightarray[j];
			k++;
			j++;
		}
		
	}

}
