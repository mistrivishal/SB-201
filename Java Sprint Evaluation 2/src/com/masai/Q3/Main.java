package com.masai.Q3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of passangers: ");
		int num = sc.nextInt();
		System.out.println("Enter traveling distance in KM: ");
		int km = sc.nextInt();
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(num, km);
		
		int res = myOla.calculateBill(myCar);
		
		System.out.println("Total fare amoun is: " + res);
	
		
	}
}
