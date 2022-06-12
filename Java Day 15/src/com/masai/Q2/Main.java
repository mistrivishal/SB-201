package com.masai.Q2;

import java.util.Scanner;

import com.masai.Q1.InvalidDateFormat;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter your joining date: ");
			String date = sc.next();
			double bonus = EmployeeBonus.getBonus(date);
			System.out.println("Your bonus is: Rs." + bonus);
		}
		catch(InvalidDateFormat idf) {
			System.out.println(idf.getMessage());
		}
		catch(InvalidAge ia) {
			System.out.println(ia.getMessage());
		}
	}
}
