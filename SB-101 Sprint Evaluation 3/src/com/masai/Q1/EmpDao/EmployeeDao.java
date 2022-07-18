package com.masai.Q1.EmpDao;

import java.util.List;
import com.masai.Q1.EmpClass.Employee;
import com.masai.Q1.EmpException.EmployeeException;

public interface EmployeeDao {
	
	public String saveEmployeeDetails(Employee employee);
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployees();
	
	public String deleteEmployee(int empId)throws EmployeeException;
}
