package com.dal.dao;

import java.sql.*;

import com.dal.util.MyDBConnection;
import com.dedalus.model.Employee;
public class EmployeeDao {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insertEmp(Employee emp)
	{
		con=MyDBConnection.getMyConnection();
		try {
			ps=con.prepareStatement("insert into employee values(?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			int nrow=ps.executeUpdate();
			System.out.println(nrow+ "got inserted into db successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateEmployee(int eno,String name)
	{
		try {

			con=MyDBConnection.getMyConnection();
			ps=con.prepareStatement("update employee set ename=? where empno=?");
			ps.setString(1,name);
			ps.setInt(2, eno);
			int nrow=ps.executeUpdate();
			System.out.println(nrow+ "got updated into db successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deletEmployee(int empno)
	{
		con=MyDBConnection.getMyConnection();
		try {
			ps=con.prepareStatement("delete from employee where empno=?");
			ps.setInt(1, empno);
			ps.executeUpdate();
			int nrow=ps.executeUpdate();
			System.out.println(nrow+ "got deleted from db successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
	public void showEmployee()
	{
		con=MyDBConnection.getMyConnection();
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" --- "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
