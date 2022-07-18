package com.masai.EtilityApp;

import java.util.List;

import com.masai.EmpDao.EmployeeDao;
import com.masai.EmpDao.EmployeeDaoImpl;
import com.masai.employeeBean.Employee;

public class GetAllEmployee {

	public static void main(String[] args) {

		EmployeeDao ed = new EmployeeDaoImpl();

		List<Employee> emps = ed.getAllEmployee();

		if (emps.isEmpty())
			System.out.println("No employeee data in table..");

		else
			emps.forEach(e -> {
				System.out.println(e);
				System.out.println("*******************");
			});

	}
}
