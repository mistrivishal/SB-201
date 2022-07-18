package com.masai.EtilityApp;

import java.util.Scanner;

import com.masai.EmpDao.EmployeeDao;
import com.masai.EmpDao.EmployeeDaoImpl;
import com.masai.employeeBean.Employee;

public class insertEmployee {

	public static void main(String[] args) {

		EmployeeDao ed = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee details..");
		boolean x = true;

		while(x) {
			System.out.println("For insert data -> 1");
			System.out.println("For stop -> 0");

			int opt = sc.nextInt();

			switch (opt) {

				case 1:
					Employee e1 = new Employee();
					System.out.println("Enter Employee ID: ");
					e1.setEid(sc.nextInt());
					System.out.println("Enter Employee Name: ");
					e1.setName(sc.next());
					System.out.println("Enter Employee Address: ");
					e1.setAddress(sc.next());
					System.out.println("Enter Employee Salary: ");
					e1.setSalary(sc.nextInt());
	
					ed.insertEmployee(e1);
					
					System.out.println("Data inserted successfully...");
					
					break;
					
				default:
					x = false;
					System.out.println("Inserting process Done..");
					break;
			}

		}
		System.out.println("Done...!");
	}
}
