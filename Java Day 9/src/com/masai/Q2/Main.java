package com.masai.Q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Parent p1 = new Child();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter number below: ");
		p1.number = sc.nextInt();
		
		p1.method1();
		p1.method2();
		p1.method3();
		((Child)p1).method4();
	}
}
