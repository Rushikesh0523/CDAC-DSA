package com.demo.test;

import java.util.Scanner;

import com.demo.stacks.StackLinkedList;

public class TestParenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StackLinkedList<Character> sstack= new StackLinkedList<>();
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			Character ch= s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				sstack.push(ch);
			}
			else
			{
				if(!sstack.isEmpty())
				{
					Character ch1=sstack.pop();
					switch(ch)
					{
					case ')':
						if(ch1!='(')
						{
							//System.out.println("no balanced paranthesis");
							flag=false;
						}
						break;

					case '}':
						if(ch1!='{')
						{
							//System.out.println("no balanced paranthesis");
							flag=false;

						}

						break;

					case ']':
						if(ch1!='[')
						{
							System.out.println("no balanced paranthesis");
							flag=false;

						}

						break;
					}
				}else
				{
					System.out.println("no balanced paranthesis");
					flag=false;

				}
			}
			if(!flag)
			{  //break the for loop
				break;
			}
		}
		if(flag && sstack.isEmpty())
		{
			System.out.println(" balanced paranthesis");

		}
		else
		{
			System.out.println("no balanced paranthesis");

		}
	}

}
