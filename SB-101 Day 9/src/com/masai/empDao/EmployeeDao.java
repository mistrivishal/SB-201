package com.masai.empDao;

import java.util.List;
import com.masai.empBean.Employee;
import com.masai.empExceptions.EmployeeException;

public interface EmployeeDao {
	
	public String insertEmpDetails(Employee emp); 
	
	public String getEmpSalaryByID(int id)throws EmployeeException;
	
	public List<Employee> getAllEmployee()throws EmployeeException;
	
	public boolean provideBonus() throws EmployeeException;
	
	public String insertEmpDetailsWithoutAddress(Employee emp); 
	
	public Employee getEmpByID(int id)throws EmployeeException;
	
	public List<Employee> getAllEmpSalaryLessThanEightyThousand()throws EmployeeException;
	
}
