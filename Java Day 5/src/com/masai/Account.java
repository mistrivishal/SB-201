package com.masai;

import java.util.Scanner;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int accountId, String accountType, int balance) {
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	public Account() {

	}
	
	public boolean withdraw(int amount) {
		if(this.balance-amount > 0) {
			this.balance -= amount;
			System.out.println("Balance amount after withdraw: " + this.balance);
			return true;
		}else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
	
}
