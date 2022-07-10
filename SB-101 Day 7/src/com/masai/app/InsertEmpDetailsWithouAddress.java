package com.masai.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.masai.connutility.UtiliDB;

public class InsertEmpDetailsWithouAddress {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Connection conn = UtiliDB.getConnection();
			
			Statement s = conn.createStatement();

			boolean insert = true;

			while (insert) {
				System.out.println("Enter 1: For inserting data");
				System.out.println("Enter 2: For Stop");
				int x = sc.nextInt();

				switch (x) {
				case 1:
					System.out.println("Enter Employee ID:");
					int eid = sc.nextInt();
					
					System.out.println("Enter Employee Name:");
					String name = sc.next();
					
					System.out.println("Enter Employee Salary:");
					int salary = sc.nextInt();
					
					int ins = s.executeUpdate("insert into Employee (eid,name,salary) VALUES("+eid+",'"+name+"',"+salary+");");
					
					if(ins>0) {
						System.out.println("data inserted...");
					}else {
						System.out.println("data not inserted...");
					}
					break;

				default:
					insert = false;
					System.out.println("Inserting process Done..");
					break;
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
