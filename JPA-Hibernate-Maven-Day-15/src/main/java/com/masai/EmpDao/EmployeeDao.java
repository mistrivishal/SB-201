package com.masai.EmpDao;

import java.util.List;

import com.masai.EmployeeException.EmployeeException;
import com.masai.employeeBean.Employee;

public interface EmployeeDao {
	
	public String insertEmployee(Employee e);

	public List<Employee> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);
}
