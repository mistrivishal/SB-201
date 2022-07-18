package com.masai.employeeBean;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity(name="Employee")
public class Employee {
	
	@Id
	private int empId;
	private String name;
	private String address;
	private int salary;
	
	
	
	public Employee(int eid, String name, String address, int salary) {
		super();
		this.empId = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	public int getEid() {
		return empId;
	}
	public void setEid(int eid) {
		this.empId = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee ID: " + empId + "\nName: " + name + "\nAddress: " + address + "\nSalary: " + salary;
	}

}
