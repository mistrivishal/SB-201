package com.masai.app;

import java.util.Scanner;
import com.masai.empBean.Employee;
import com.masai.empDao.*;
import com.masai.empExceptions.EmployeeException;

public class EmpSearchByID {

	public static void main(String[] args) {
			
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter employee ID: ");
		int id = sc.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		
		try {
			Employee e = eDao.getEmpByID(id);
			
			System.out.println(e);
			
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}
}
