package com.masai.EtilityApp;

import java.util.Arrays;
import java.util.Scanner;

import com.masai.EmpDao.EmployeeDao;
import com.masai.EmpDao.EmployeeDaoImpl;

public class GetNameAndAddress {
	
	public static void main(String[] args) {
		
		
		EmployeeDao ed = new EmployeeDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employe ID to get Name and Address..");
		
		String[] s = ed.getNameAndAddress(sc.nextInt());
		
		if(s != null) {
			System.out.println(Arrays.toString(s));
		}else {
			System.out.println("Empty set..");
		}
	}
}
