package com.masai.EtilityApp;

import java.util.Scanner;

import com.masai.EmpDao.*;

public class GiveBonusToEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Employee Id to give bonus...");
		int eid = sc.nextInt();
		System.out.println("enter bonus amount..");
		int bonus = sc.nextInt();
		
		String s = ed.giveBonusToEmployee(eid, bonus);
		
		System.out.println(s);
		
	}
}
