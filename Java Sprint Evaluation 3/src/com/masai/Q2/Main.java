package com.masai.Q2;

public class Main {

	public static void main(String[] args) {
		
		Loan loan = Loan.getClass;
		
		
		//1. by supplying PermanentEmployee object:-
		Employee e1 = new PermanentEmployee(101,"RAJSEKAR");
		PermanentEmployee pe = (PermanentEmployee)e1;
		pe.setBasicPay(40000);
		pe.calculateSalary();
		double loanAmtP = loan.calculateLoanAmount(e1);
		System.out.println("Loan amount for temporary employee: " + loanAmtP);
		
		//2. by supplying TemporaryEmployee object:-
		Employee e2 = new TemporaryEmployee(102,"RATAN");
		TemporaryEmployee e = (TemporaryEmployee)e2;
		e.setHoursWorked(8);
		e.setHourlyWages(600);
		e.calculateSalary();
		double loanAmtT = loan.calculateLoanAmount(e1);
		System.out.println("Loan amount for temporary employee: " + loanAmtT);
		//3. by supplying a null value:-
		double loanAmtNull = loan.calculateLoanAmount(null);
		System.out.println("Loan amount for NULL: " + loanAmtNull);
	}
}
