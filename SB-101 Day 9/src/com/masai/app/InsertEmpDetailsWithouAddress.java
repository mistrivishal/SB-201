package com.masai.app;

import java.util.Scanner;

import com.masai.empBean.Employee;
import com.masai.empDao.EmployeeDao;
import com.masai.empDao.EmployeeDaoImpl;

public class InsertEmpDetailsWithouAddress {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		EmployeeDao eDao = new EmployeeDaoImpl();
		
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

					Employee e = new Employee(eid, name, null, salary);
					
					String s = eDao.insertEmpDetailsWithoutAddress(e);
					
					System.out.println(s);
					
					break;

				default:
					insert = false;
					System.out.println("Inserting process Done..");
					break;
				}
			}
		
	}
}
