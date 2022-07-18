package com.masai.Q1.mainApp;

import java.util.List;
import java.util.Scanner;

import com.masai.Q1.EmpClass.Employee;
import com.masai.Q1.EmpDao.*;
import com.masai.Q1.EmpException.EmployeeException;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		EmployeeDao ed = new EmployeeDaoImpl();
		
//		save emp details
		boolean b = true;
		while(b) {
			System.out.println("1 for save data..");
			System.out.println("0 for stop..");
			
			int yn = sc.nextInt();
			
			switch (yn) {
			case 1:
				System.out.println("enter emp ID");
				int id = sc.nextInt();
				System.out.println("enter emp name");
				String n = sc.next();
				System.out.println("enter empm address");
				String add = sc.next();
				System.out.println("enter emp salary");
				int s = sc.nextInt();
				
				Employee e = new Employee(id, n, add, s);
				String ss = ed.saveEmployeeDetails(e);
				
				System.out.println(ss);
				break;

			default:
				System.out.println("data entry done...");
				b = false;
				break;
			}
			
		}
		
//		get employee by ID
		
		System.out.println("Enter employee ID to get Data...");
		try {
			Employee ee = ed.getEmployeeById(sc.nextInt());
			
			System.out.println(ee);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
//		get all employee details
		
		System.out.println("\n this get all data method execution....\n");
		
		List<Employee> el = ed.getAllEmployees();
		
		el.forEach(e -> {
			System.out.println(e);
			System.out.println("******************");
		});
		
//		delete employee by ID
		
		System.out.println("\n this delete data method execution....");
		
		
		System.out.println("Enter employee ID to delete Data...");
		try {
			String rs = ed.deleteEmployee(sc.nextInt());
			
			System.out.println(rs);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}	
