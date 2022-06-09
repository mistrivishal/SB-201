package com.masai.Q1;

import java.util.Scanner;

public class AccountDemo {

	static void error () throws InsufficientFundsException {
		InsufficientFundsException ifb = new InsufficientFundsException("Insuficient Balance!");
		throw ifb;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your account number: ");
		
		String accNum = sc.next();
		Account ac;
		while(true) {
			if(accNum.matches("[0-9]{12}")) {
				ac = new Account(accNum);
				break;
			}else {
				System.out.println("Enter valid account number!");
				accNum = sc.next();
			}
		}
		
		System.out.println("Enter amount to deposite: ");
		double amtDip = sc.nextDouble();
		ac.deposit(amtDip);
		
		try {
			System.out.println("Enter amount to withdraw: ");
			double amt = sc.nextDouble();
			if(amt<=ac.balance) {
				ac.withdraw(amt);
				System.out.println("You withdraw: Rs." + amt + "\nYour current balance is: Rs." + ac.balance);
			}else {
				error();
				System.out.println("Your balance is: Rs." + ac.balance + "only!");;
			}
		}
		catch(InsufficientFundsException ifb) {
			System.out.println(ifb.getMessage());
		}
		
		System.out.println("\nThank you for Banking with us!");
	}
}
