package com.masai.Q3;

public class Withdraw extends Thread {

	int amount;
	Account account;

	public Withdraw(int amount, Account account) {
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {

		synchronized (this) {
			account.withdraw(amount);

		}

	}

}
