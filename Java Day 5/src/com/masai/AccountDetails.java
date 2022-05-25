package com.masai;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails(int amount) {
		if(amount>0) {
			return new Account();
		}
		else {
			System.out.println("Amount should be positive");
			return null;
		}
	}
	
	public int getWithdrawAmount(int amount) {
		if(amount>0) {
			return amount;
		}else {
			System.out.println("Amount should be positive");
			return amount;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account id: ");
		int accId = scan.nextInt();
		System.out.println("Enter account type: ");
		String accType = scan.next();
		AccountDetails a1 = new AccountDetails();
		int accBalance = -1;
		while(true){
			System.out.println("Enter balance: ");
			accBalance = scan.nextInt();
			if(accBalance>0) {
				break;
			}
		}	
		a1.getAccountDetails(accBalance);
		Account detail = a1.getAccountDetails(accBalance);
		detail.setAccountId(accId);
		detail.setAccountType(accType);
		detail.setBalance(accBalance);
		System.out.println("Enter amount to be withdrawn: ");
		int amount = scan.nextInt();
		
		detail.withdraw(amount);
		
		
	}
	
}
