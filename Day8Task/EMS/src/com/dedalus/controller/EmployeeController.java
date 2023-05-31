package com.dedalus.controller;
import java.io.*;

import java.util.*;

import com.dal.dao.EmployeeDao;
import com.dedalus.model.Employee;

public class EmployeeController implements EmployeeInterface{
	Scanner sc=new Scanner(System.in);
	Employee emp;
	List<Employee> emplist = new ArrayList<>(); 
	EmployeeDao ed=new EmployeeDao();
	public void addEmployee()
	{

		emp = new Employee();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		ed.insertEmp(emp);
		System.out.println("Employee Added Successfully");
		
	}
	
	public void viewEmployee()
	{
//		System.out.println("Empno: "+emp.getEmpno());
//		System.out.println("Emp name: "+emp.getEname());
		System.out.println(emplist);
		
		System.out.println("Data from DB: ");
		ed.showEmployee();
	}

	public void serializeEmp() 
	{
		
		try
		{
			
			FileOutputStream fout=new FileOutputStream("main.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
		
			objout.writeObject(emplist);
			System.out.println("Employee details serialized..");
			objout.close();
			fout.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			

	}
	
	public void deserializeEmp()
	{
		try
		{
			FileInputStream finp=new FileInputStream("main.txt");
			ObjectInputStream objinp=new ObjectInputStream(finp);
			emplist=(ArrayList<Employee>)objinp.readObject();
			System.out.println("Employee details deserialized..");
			
//			for(Employee e : emplist)
//				System.out.println(e.toString());
			
			Iterator<Employee> itr=emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			finp.close();
			objinp.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public void update(int eno,String name)
	{
		ed.updateEmployee(eno,name);
		
	}
	
	public void delet(int empno)
	{
		ed.deletEmployee(empno);
	}
}
