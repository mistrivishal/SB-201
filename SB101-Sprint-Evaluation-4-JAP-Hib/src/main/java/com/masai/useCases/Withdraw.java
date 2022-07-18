package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.Exception.InsufficientBalance;
import com.masai.bankDB.Account;

public class Withdraw {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter account ID:");
		int id = sc.nextInt();
		System.out.println("Enetr email address:");
		String e = sc.next();
		System.out.println("Enter Address:");
		String add = sc.next();
		System.out.println("Enter initial amount:");
		double bal = sc.nextDouble();
		System.out.println("Enter withdraw amount:");
		double amt = sc.nextDouble();
		
		Account ac = new Account(id, e, add, bal);
		
		AccountDao ad = new AccountDaoImpl();
		
		try {
			int a = ad.withdraw(amt,ac);
			if(a!=0) {
				System.out.println("withdraw success..");
			}else {
				System.out.println("withdraw unsuccess..");
			}
		} catch (InsufficientBalance e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
