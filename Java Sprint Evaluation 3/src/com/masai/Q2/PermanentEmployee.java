package com.masai.Q2;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
	}

	@Override
	void calculateSalary() {
		double salary = this.basicPay - (this.basicPay*0.12);
		setSalary(salary);
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

}
