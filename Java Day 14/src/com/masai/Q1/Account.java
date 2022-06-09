package com.masai.Q1;

public class Account {
	
	String accountNumber;
	double balance;
	
	void deposit(double amount) {
		
		this.balance += amount;
		System.out.println("You deposited: Rs." + amount + "\nYour current balance is: Rs." + this.balance + "\n"); 
	}
	
	double withdraw(double amount) {
		
		this.balance -= amount;
		return this.balance;
	}

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	
}
