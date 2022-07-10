package com.masai.app;

import java.util.Scanner;
import com.masai.empDao.*;
import com.masai.empExceptions.EmployeeException;

public class GetEmpSalaryByID {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		
		try {
			String s = eDao.getEmpSalaryByID(id);
			
			System.out.println(s);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
