package com.schoolmanagement.app.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static String url = "jdbc:oracle:thin:@localhost:1521:'XE'";
	
	static String user = "qldsuser";
	
	static String password = "qldsuser";
	
	static Connection con = null;
	
	public static Connection provideConnection()
	{
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con !=null)
			{
				System.out.println("Connection Established Succesfully");
			}
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Failed to Create Connection ");
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
