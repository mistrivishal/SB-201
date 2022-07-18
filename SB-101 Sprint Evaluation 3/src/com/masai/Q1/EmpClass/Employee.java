package com.masai.Q1.EmpClass;

public class Employee {
	
//	empId: int Primary key
//	name: varchar not null
//	address: varchar not null
//	salary: int not null
	
	private int empID;
	private String name;
	private String address;
	private int salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String naem) {
		this.name = naem;
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
	public Employee(int empID, String naem, String address, int salary) {
		super();
		this.empID = empID;
		this.name = naem;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee ID: " + empID + "\nName: " + name + "\nAddress: " + address + "\nSalary: " + salary;
	}
	
	
	
}
