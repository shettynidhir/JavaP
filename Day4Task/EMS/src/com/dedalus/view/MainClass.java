package com.dedalus.view;
import java.io.*;
import java.util.*;
import com.dedalus.controller.EmployeeController;
import com.dedalus.controller.EmployeeInterface;

public class MainClass {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String yesno=null;
		System.out.println("Employee Management System");
//		EmployeeController ec=new EmployeeController();
		EmployeeInterface ec=new EmployeeController();
		try
		{
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
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
		
		
		
	}
}
