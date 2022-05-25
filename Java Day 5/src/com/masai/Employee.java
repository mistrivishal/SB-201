package com.masai;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public Employee() {

	}
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		
		double netSal = (this.salary - (this.salary* pfpercentage)/100);
		this.setNetSalary(netSal);
		return;
	}
	public static Employee getEmployeeDetails(int empID, String empName, Double empSalary) {
		return new Employee(empID,empName,empSalary);
	}

	
	
}
