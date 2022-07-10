package com.masai.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.masai.connutility.UtiliDB;

public class ProvideBonusToEmployees {

	public static void main(String[] args) {
		
		
		try {
			Connection conn = UtiliDB.getConnection();
			
			PreparedStatement ps  = conn.prepareStatement("UPDATE Employee SET Salary = Salary + "+500+"");
			
			int a = ps.executeUpdate();
			
			if(a>0) {
				System.out.println("Bonus is credited");
			}else {
				System.out.println("Bonus credit failed");
			}

			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
