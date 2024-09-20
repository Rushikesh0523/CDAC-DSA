package com.demo.test;

import java.util.Scanner;

import com.demo.searching.ArrayService;

public class TestSearching {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		ArrayService.acceptdata(arr);
		ArrayService.displaydata(arr);
		System.out.println("1. sequential search \n 2. binary search ");
		int choice=sc.nextInt();
		System.out.println("enetr number for search");
		int num=sc.nextInt();
		if (choice==1) { //sequential search
				int pos=ArrayService.searchNumber(num,arr);
				if(pos!=-1) {
					System.out.println(num+" found at "+pos+" position");
				}else {
					System.out.println("not found");
				}
		}else { // binary search
			int pos=ArrayService.binarySearch(arr,0,arr.length-1,num);
			if(pos!=-1) {
				System.out.println(num+" found at "+pos+" position");
			}else {
				System.out.println("not found");
			}
		}
		
	}
}
