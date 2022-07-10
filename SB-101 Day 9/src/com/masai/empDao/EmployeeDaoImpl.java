package com.masai.empDao;

import java.sql.*;
import java.util.*;
import com.masai.connutility.UtiliDB;
import com.masai.empBean.Employee;
import com.masai.empExceptions.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String insertEmpDetails(Employee emp) {
		String msg = "Not Inserted..";

		try (Connection conn = UtiliDB.getConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into Employee3 values(?,?,?,?)");
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setInt(4, emp.getSalary());

			int ins = ps.executeUpdate();

			if (ins > 0)
				msg = "Data Inserted Successfully..!";

		} catch (SQLException e) {

			msg = e.getMessage();
		}

		return msg;
	}
	
	@Override
	public String getEmpSalaryByID(int id) throws EmployeeException {
		
		String msg = "Employee not exist";
		
		try(Connection conn = UtiliDB.getConnection()){
			
			PreparedStatement ps  = conn.prepareStatement("SELECT salary FROM Employee3 WHERE eid = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				msg = "Slary for given ID: "+id+" is "+ rs.getInt("Salary");
			}else {
				throw new EmployeeException("Employee does not exist");
			}		
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		List<Employee> emp = new ArrayList<>();
		
		try (Connection conn = UtiliDB.getConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				Employee e = new Employee(eid, name, address, salary);
				
				emp.add(e);
			}
			
			if(emp.isEmpty()) {
				throw new EmployeeException("There no employe data in this table");
			}
				
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public boolean provideBonus() throws EmployeeException {
		boolean credited = false;
		
		try (Connection conn = UtiliDB.getConnection()) {
			PreparedStatement ps  = conn.prepareStatement("UPDATE Employee3 SET Salary = Salary + "+500+"");
			
			int c = ps.executeUpdate();
			
			if(c>0) {
				credited = true;
			}else {
				throw new EmployeeException("Bonus not creadited..");
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		return credited;
	}

	@Override
	public String insertEmpDetailsWithoutAddress(Employee emp) {
		
		String msg = "Data Not Inserted";
		
		try (Connection conn = UtiliDB.getConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee3 (eid,name,salary) values(?,?,?)");
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());

			int ins = ps.executeUpdate();

			if (ins > 0)
				msg = "Data Inserted Successfully..!";
			
			
		} catch (SQLException e) {
			msg = e.getMessage();
		}
		return msg;
	}

	@Override
	public Employee getEmpByID(int id) throws EmployeeException {
		Employee e = null;
		try (Connection conn = UtiliDB.getConnection()) {
			
			PreparedStatement ps  = conn.prepareStatement("SELECT * FROM Employee3 WHERE eid = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				e = new Employee(rs.getInt("eid"), rs.getString("name"), rs.getString("address"), rs.getInt("salary"));
			}else {
				throw new EmployeeException("Employee does not exist");
			}
		} catch (SQLException se) {
			throw new EmployeeException(se.getMessage());
		}
		return e;
	}

	@Override
	public List<Employee> getAllEmpSalaryLessThanEightyThousand() throws EmployeeException {
		List<Employee> emp = new ArrayList<>();
		
		try(Connection conn = UtiliDB.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where salary < ?");
			ps.setInt(1, 80000);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				Employee e = new Employee(eid, name, address, salary);
				
				emp.add(e);
			}
			
			if(emp.isEmpty()) {
				throw new EmployeeException("There no employe whose salary less than 80,000");
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		return emp;
	}



}
