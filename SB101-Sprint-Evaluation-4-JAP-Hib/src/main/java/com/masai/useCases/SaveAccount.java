package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.bankDB.Account;

public class SaveAccount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account ID:");
		int id = sc.nextInt();
		System.out.println("Enetr email address:");
		String e = sc.next();
		System.out.println("Enter Address:");
		String add = sc.next();
		System.out.println("Enter initial amount:");
		double bal = sc.nextDouble();
		
		Account ac = new Account(id, e, add, bal);
		
		AccountDao ad = new AccountDaoImpl();
		
		ad.save(ac);
		
	}
}
