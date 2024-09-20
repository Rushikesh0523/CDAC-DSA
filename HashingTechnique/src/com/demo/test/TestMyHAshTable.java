package com.demo.test;

import com.demo.hashing.MyHashTable;

public class TestMyHAshTable {

	public static void main(String[] args) {
		MyHashTable table=new MyHashTable(5);
		table.insertdata(50);
		table.insertdata(51);
		table.insertdata(30);
		table.insertdata(42);
		table.insertdata(47);
		table.insertdata(4);
		table.displaydata();
		System.out.println("find 42"+table.searchdata(42));
		System.out.println("find 77"+table.searchdata(77));
		System.out.println("find 53"+table.searchdata(53));
	}

}
