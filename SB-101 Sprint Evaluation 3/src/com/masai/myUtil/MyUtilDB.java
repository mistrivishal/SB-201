package com.masai.myUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyUtilDB {
	
	public static Connection getConn() {
		
		Connection c = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		String dbLocation = "jdbc:mysql://localhost:3306/db1";
		
		try {
			c = DriverManager.getConnection(dbLocation,"root","Vishal@123");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return c;
	}
}
