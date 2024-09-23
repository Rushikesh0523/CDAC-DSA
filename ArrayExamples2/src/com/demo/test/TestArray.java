package com.demo.test;

import com.demo.service.ArrayService;

public class TestArray {
public static void main(String[] args) {
	int[] arr=new int[5];
	
	ArrayService.acceptdata(arr);
	
	ArrayService.displaydata(arr);
	
	int num=ArrayService.findmax(arr);
	
	System.out.println("Maximum number is: "+num);
	
	num=ArrayService.findevenmaxnumber(arr);
	
	if(num!=-1) {
	  System.out.println("Maximum even number : "+num);
	}
	else {
	   System.out.println("no even number present");
	}
	
	ArrayService.findDigitsSumAll(arr);
	
	int[] arr1=ArrayService.findDuplicates(arr);
	
	if(arr1!=null) {
			ArrayService.displaydata(arr1);
	}else {
		System.out.println("not found");
	}
	
	ArrayService.rotatearray(4,arr);
	
	ArrayService.displaydata(arr);
}

}
