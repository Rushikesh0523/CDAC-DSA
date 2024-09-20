package com.demo.service;

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

	public static int findmax(int[] arr) {
		int max=arr[0];
		int pos=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				pos=i;
			}
		}
		return max;
	}

	public static int findevenmaxnumber(int[] arr) {
		//find the first even number, consider it as maximum num
		int i=0,max=-1;
		for(;i<arr.length;i++) {
			if(arr[i]%2==0)
			{
				max=arr[i];
				break;
			}
		}
		//check for remaining numbers
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]%2==0 && arr[j]>max) {
				max=arr[j];
			}
		}
		return max;
	}
	
	private static int findSumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum=sum+d;
			num=(int)(num/10);
			
		}
		return sum;
	}

	public static void findDigitsSumAll(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int s=findSumOfDigits(arr[i]);
			System.out.println(s);
			sum=sum+s;
					
		}
		System.out.println("Total sum : "+sum);
		
	}

	public static int[] findDuplicates(int[] arr) {
		int[] arr1=new int[arr.length/2];
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			int num=arr[i];
			boolean flag=checkexists(num,arr1);
			if(!flag) { //!flag   flag==false
				System.out.println("check: "+num);
				for( int j=i+1;j<arr.length;j++) {
					if(num==arr[j]) {
						arr1[count]=num;
						count++;
						break;
					}
				}
			}
			}
		if(count>0)
		    return arr1;
		else
			return null;
			
		}

	private static boolean checkexists(int num, int[] arr1) {
		for(int i=0;i<arr1.length;i++) {
			if(num==arr1[i]) {
				return true;
			}
		}
		return false;
	}
	

}

