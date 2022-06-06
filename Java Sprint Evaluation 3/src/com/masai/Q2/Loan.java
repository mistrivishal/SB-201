package com.masai.Q2;

public class Loan {

	static Loan getClass = new Loan(); 
	
	private Loan() {
			
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmt;
		if(employeeObj!=null) {
			if(employeeObj instanceof PermanentEmployee) {
				loanAmt = 0.15 * employeeObj.getSalary();
				
			}else {
				loanAmt = 0.10 * employeeObj.getSalary();
			}
			return loanAmt;
		}
		return 0;
	}
}
