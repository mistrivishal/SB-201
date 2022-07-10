package com.masai.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.connutility.UtiliDB;

public class EmpSalaryLessThanEigthyThousand {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = UtiliDB.getConnection();
			
			PreparedStatement ps  = conn.prepareStatement("SELECT * FROM EMPLOYEE WHERE Salary < "+80000+"");
			System.out.println("Provide Employee ID: ");
			
			ResultSet rs = ps.executeQuery();
			
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
