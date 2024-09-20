package com.demo.sorting;

import java.util.Scanner;

public class BubblesortDemo {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr number");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
		
	}

	public static void sortdataascending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("Iteration : "+i);
			displayData(arr);
		}
		
		
	}
	public static void improvedsortdataascending(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println("Iteration : "+i);
			displayData(arr);
			if(!flag) {
				System.out.println("in flag flase");
				break;
			}
		}
		
		
	}

	public static void sortdatadescending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
