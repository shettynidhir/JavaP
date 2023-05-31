package com.dal.util;
import java.sql.*;
public class MyDBConnection {

	static Connection con; 
	
	public static Connection getMyConnection()
	{

		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Orac@23");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	public static void main(String[] args) {
	System.out.println(getMyConnection());
		
	}

}
