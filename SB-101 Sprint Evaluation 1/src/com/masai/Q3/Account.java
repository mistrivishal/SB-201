package com.masai.Q3;

public class Account {

	int balance;
	int accountNo;

	void displayBalance() {
		System.out.println("\nAccount No: " + this.accountNo + " Balance: " + this.balance);
	}

	public synchronized void deposit(int amount) {
		this.balance += amount;
		System.out.println("\n" + amount + " is deposited");
		displayBalance();
	}

	public synchronized void withdraw(int amount) {
		this.balance -= amount;
		System.out.println("\n" + amount + " is withdrawn");
		displayBalance();
	}
}
