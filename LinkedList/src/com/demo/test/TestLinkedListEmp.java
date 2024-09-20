package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestLinkedListEmp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("1. add new employee by position\n2. display All\n");
			System.out.println("3. display by id\n4. display by name\n5. delete by id\n");
			System.out.println("6. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.addnewEmp();
				break;
			case 2:
				es.displayall();
				break;
			case 3:
				break;
			case 4:
				System.out.println("enetr name to search");
				String nm=sc.next();
				es.displayByName(nm);
				break;
			case 5:
				System.out.println("enetr id");
				int id=sc.nextInt();
				es.deleteById(id);
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
			default:
				break;
			}
			
			
		}while(choice!=6);
	}

}
