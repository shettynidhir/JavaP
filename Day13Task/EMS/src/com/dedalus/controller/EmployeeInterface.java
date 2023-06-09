package com.dedalus.controller;

import java.io.IOException;

public interface EmployeeInterface
{
		public void addEmployee();
		public void viewEmployee();
		public void serializeEmp();
		public void deserializeEmp();
		public void update(int eno,String name);
		public void delet(int empno);
		public void sortName();
		public void sortEmpno();
		
	}

