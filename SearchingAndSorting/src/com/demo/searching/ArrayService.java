package com.demo.searching;

import java.util.Scanner;

public class ArrayService {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enetr number");
			arr[i]=sc.nextInt();
		}
		
		
	}

	public static void displaydata(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"--->"+arr[i]);
		}
		
	}
    //sequential search
	public static int searchNumber(int num,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
		
	}

	public static int binarySearch(int[] arr, int low, int high, int num) {
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==num) {
				return mid;
			}else {
				if(arr[mid]<num) //check in right side of the array
					return binarySearch(arr,mid+1,high,num); 
				else //check in left side of the array
					return binarySearch(arr,low,mid-1,num);
			}
			
		}else { //not found
			return -1;
		}
	}
}

