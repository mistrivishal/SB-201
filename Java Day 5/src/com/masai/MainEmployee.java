package com.masai;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Employee ID: ");
			int empID = scan.nextInt();

			System.out.println("Enter Employee Name: ");
			scan.nextLine();
			String empName = scan.nextLine();

			System.out.println("Enter Employee Salary: ");
			Double empSalary = scan.nextDouble();

			System.out.println("Enter Employee PF percentage: ");
			int empPF = scan.nextInt();
			
			System.out.println("\n");
			System.out.println("Employee Details :-");
			Employee  e1 = Employee.getEmployeeDetails(empID,empName,empSalary);

			int pf = MainEmployee.getPFPercentage(empPF);
			
			
			e1.calculateNetSalary(pf);
			
			System.out.println("Id: " + e1.getEmployeeId());
			System.out.println("Name: " + e1.getEmployeeName());
			System.out.println("Salary " + e1.getSalary());
			System.out.println("Net Salary: " + e1.getNetSalary());
		}
		
	}
	
	public static int getPFPercentage(int pf){
		return pf;
	}
}
