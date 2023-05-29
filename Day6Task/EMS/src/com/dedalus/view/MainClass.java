package com.dedalus.view;
import java.io.*;
import java.util.*;
import java.util.function.BiPredicate;

import com.dedalus.controller.EmployeeController;
import com.dedalus.controller.EmployeeInterface;

public class MainClass {
	
	public static void main(String[] args) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BiPredicate<String,String> login=(user,pass)-> user.equals("admin") && pass.equals("admin");
		Scanner sc=new Scanner(System.in);
		String user=null;
		String pass=null;
		String yesno=null;
		EmployeeInterface ec=new EmployeeController();
		try
		{
		
		System.out.print("\nUsername: ");
		user=br.readLine();
		System.out.print("\nPassword: ");
		pass=br.readLine();
		
		if(login.test(user,pass))
		{
			System.out.println("Employee Management System");
				do
				{
					System.out.println("1. Add employee\t2.View employee\t3.Serialize\t4.Deserialize");
					System.out.print("Enter your choice: ");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1: 	ec.addEmployee();
							break;
					case 2:  	ec.viewEmployee();
							break;
					case 3: 
							ec.serializeEmp();
						break;
					case 4: ec.deserializeEmp();
							break;
						
					default: System.out.println("Invalid choice!!");
					break;
					}
				
					System.out.println("\nDo you want to continue? y | Y ");
					 yesno=sc.next();
					 
				}while(yesno.equals("y") || yesno.equals("Y"));
				
			
			
		}
		else
		{	
			System.out.println("Invalid credentials!!");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
	
		
	
		
		
		
	}
}
