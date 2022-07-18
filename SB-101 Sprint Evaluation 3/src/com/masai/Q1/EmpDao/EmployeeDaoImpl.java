package com.masai.Q1.EmpDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.masai.Q1.EmpClass.Employee;
import com.masai.Q1.EmpException.EmployeeException;
import com.masai.myUtil.MyUtilDB;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String s = "Employee details not saved..";
		
		try(Connection c = MyUtilDB.getConn()){
			
			PreparedStatement ps = c.prepareStatement("Insert Into Employee values (?,?,?,?)");
			
			ps.setInt(1, employee.getEmpID());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int saved = ps.executeUpdate();
			
			if(saved>0) {
				s = "Employee details saved successfully..";
			}
			
			
		} catch (SQLException e) {
			s = e.getMessage();
		}
		
		return s;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee e = null;
		
		try(Connection c = MyUtilDB.getConn()){
			
			PreparedStatement ps = c.prepareStatement("Select * from Employee Where empID = ?");
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				e = new Employee(rs.getInt("empID"),rs.getString("name"),rs.getString("address"),rs.getInt("salary"));
			}else {
				throw new EmployeeException("Employee does not exist..");
			}
			
		} catch (SQLException e1) {
			throw new EmployeeException(e1.getMessage());
		}
		
		return e;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> el = new ArrayList<>();
		
		try(Connection c = MyUtilDB.getConn()){
			
			PreparedStatement ps = c.prepareStatement("Select * from Employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Employee e = new Employee(rs.getInt("empID"),rs.getString("name"),rs.getString("address"),rs.getInt("salary"));
				
				el.add(e);
			}
			
		} catch (SQLException e1) {
			System.out.println("Employee set is empty...");
		}
		
		return el;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		String s = "Not deleted...";
		
		try(Connection c = MyUtilDB.getConn()){
			
			PreparedStatement ps = c.prepareStatement("Delete from Employee Where empID = ?");
			ps.setInt(1, empId);
			
			int rs = ps.executeUpdate();
			
			if(rs>0) {
				s = "Employee details deleted successfully";
			}else {
				throw new EmployeeException("Employee does not exist..");
			}
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return s;
	}

}
