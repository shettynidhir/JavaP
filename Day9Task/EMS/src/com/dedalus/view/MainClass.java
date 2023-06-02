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
					System.out.println("1. Add employee\n2.View employee\n3.Serialize\n4.Deserialize\n5.Update employee\n6.Delete employee\n7.Sort employee w.r.t name\n8.Sort employee w.r.t salary ");
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
					case 5: 
						System.out.print("\nEnter the empno: ");
						int eno=sc.nextInt();
						System.out.print("\nEnter the name to be updated: ");
						String ename=br.readLine();
						ec.update(eno,ename);
						break;
						
					case 6:
						System.out.print("\nEnter the empno to be deleted: ");
						int empno=sc.nextInt();
						ec.delet(empno);
						break;
					default: System.out.println("Invalid choice!!");
					break;
					
					case 7: ec.sortName();
							break;
					case 8: ec.sortEmpno();
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
