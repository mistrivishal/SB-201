package com.masai.app;

import java.util.List;

import com.masai.empBean.Employee;
import com.masai.empDao.EmployeeDao;
import com.masai.empDao.EmployeeDaoImpl;
import com.masai.empExceptions.EmployeeException;

public class GetAllEmpDetails {
	
	public static void main(String[] args) {
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		
		try {
			List<Employee> emp = eDao.getAllEmployee();
			
			emp.forEach( e ->{
				System.out.println(e);
				System.out.println("*************************");
			});
			
		} catch (EmployeeException e) {
			e.printStackTrace();
		}

	}
}
