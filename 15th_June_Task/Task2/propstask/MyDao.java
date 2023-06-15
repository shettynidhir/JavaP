package com.dal.propstask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDao {
	private String url;
	private String uname;
	private String password;
	private Connection con; 

	public MyDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDao(String url, String uname, String password) {
		super();
		this.url = url;
		this.uname = uname;
		this.password = password;
	}

	
	public Connection getMyConnection()
	{

		try {
			con=DriverManager.getConnection(url,uname,password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	
	public String geturl() {
		return url;
	}

	public void seturl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDao [url=" + url + ", uname=" + uname + ", password=" + password + "]";
	}

}
