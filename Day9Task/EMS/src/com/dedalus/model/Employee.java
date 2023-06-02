package com.dedalus.model;

import java.io.Serializable;
import java.util.Comparator;



public class Employee implements Serializable{
	private int empno;
	private String ename;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno=empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return (e1.getEname().compareTo(e2.getEname()));
		}
		
		
	};
	
//	public int compareTo(Employee e1) {
//		
//		return this.empno - e1.empno;
//	
//	}	
	
	public static Comparator<Employee> empnoComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return (e1.getEmpno() - e2.getEmpno());
		}
		
		
	};
	
	
}
