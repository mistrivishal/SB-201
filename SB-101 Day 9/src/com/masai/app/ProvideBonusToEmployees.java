package com.masai.app;

import com.masai.empDao.EmployeeDao;
import com.masai.empDao.EmployeeDaoImpl;
import com.masai.empExceptions.EmployeeException;

public class ProvideBonusToEmployees {

	public static void main(String[] args) {
		
		EmployeeDao eDao =  new EmployeeDaoImpl();
		
		try {
			boolean c = eDao.provideBonus();
			
			if(c){
				System.out.println("Bonus credited successfully");
			}
			
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
}
