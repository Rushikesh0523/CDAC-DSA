package com.demo.service;

import java.util.Scanner;

import com.demo.linkedlist.SinglyLinkedListEmp;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
     private SinglyLinkedListEmp lst;

	public EmployeeServiceImpl() {
		lst=new SinglyLinkedListEmp();
	}

	@Override
	public void addnewEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		System.out.println("enetr position");
		int pos=sc.nextInt();
		lst.addEmployeeByPos(new Employee(id,nm,sal),pos);
		
		
		
		
		
	}

	@Override
	public void displayall() {
		lst.displayall();
		
	}

	@Override
	public void displayByName(String nm) {
		lst.displayByName(nm);
		
	}

	@Override
	public void deleteById(int id) {
		lst.deleteById(id);
		
	}
     
}
