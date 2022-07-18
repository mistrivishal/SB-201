package com.masai.EtilityApp;

import java.util.Scanner;

import com.masai.EmpDao.EmployeeDao;
import com.masai.EmpDao.EmployeeDaoImpl;

public class DeleteEmployeeFromTable {
	
	public static void main(String[] args) {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employe ID to delete..");
		boolean x = ed.deleteEmployee(sc.nextInt());
		if(x) {
			System.out.println("Employee data deleted..");
		}else {
			System.out.println("Employee data not deleted..");
		}
	}
}
