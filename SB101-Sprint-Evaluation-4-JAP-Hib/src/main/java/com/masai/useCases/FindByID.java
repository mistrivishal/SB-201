package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.Exception.InvalidAccount;
import com.masai.bankDB.Account;

public class FindByID {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter account id");
		
		AccountDao ad = new AccountDaoImpl();
		
		try {
			Account ac = ad.findById(sc.nextInt());
			System.out.println(ac);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
