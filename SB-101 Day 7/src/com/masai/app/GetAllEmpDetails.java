package com.masai.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.masai.connutility.UtiliDB;

public class GetAllEmpDetails {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = UtiliDB.getConnection();
			
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE");
			
			while(rs.next()){
				System.out.println("Employee ID: " + rs.getInt("eid"));
				System.out.println("Employee Name: " + rs.getString("name"));
				System.out.println("Employee Address: " + rs.getString("address"));
				System.out.println("Employee Salary: " + rs.getInt("salary"));
				System.out.println("**************************");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
