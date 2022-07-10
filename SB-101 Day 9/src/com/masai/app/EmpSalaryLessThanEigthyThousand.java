package com.masai.app;

import java.util.List;
import com.masai.empBean.Employee;
import com.masai.empDao.*;
import com.masai.empExceptions.EmployeeException;

public class EmpSalaryLessThanEigthyThousand {
	
	public static void main(String[] args) {
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		
		try {
			List<Employee> emp = eDao.getAllEmpSalaryLessThanEightyThousand();
			
			emp.forEach( e ->{
				System.out.println(e);
				System.out.println("*************************");
			});
			
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		
	}

}
