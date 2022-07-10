package com.masai.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.connutility.UtiliDB;

public class EmpSearchByID {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				Connection conn = UtiliDB.getConnection();
				
				System.out.println("Provide Employee ID: ");
				int id = sc.nextInt();
				
				PreparedStatement ps  = conn.prepareStatement("SELECT * FROM EMPLOYEE WHERE eid = ?");
				ps.setInt(1, id);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()){
					System.out.println("Employee ID: " + rs.getInt("eid"));
					System.out.println("Employee Name: " + rs.getString("name"));
					System.out.println("Employee Address: " + rs.getString("address"));
					System.out.println("Employee Salary: " + rs.getInt("salary"));
					System.out.println("**************************");
				}else {
					System.out.println("Employee does not exist");
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}
}
