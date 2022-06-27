package com.masai.Q3;

public class Deposit extends Thread {

	int amount;
	Account account;

	public Deposit(int amount, Account account) {
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {
		synchronized (this) {
			account.deposit(amount);
		}
	}

}
