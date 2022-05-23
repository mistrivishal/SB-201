package com.masaiEvaluation;

import java.util.Scanner;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter: ");
		int noSt = scan.nextInt();
		
		for(int i =0; i<noSt; i++) {
			System.out.println("Enter Roll No");
			int roll = scan.nextInt();
			System.out.println("Enter Name");
			String name = scan.next();
			System.out.println("Enter Marks");
			int marks = scan.nextInt();
			
			Student s1 = new Student(roll,name,marks);
			s1.getData(i+1);
			System.out.println("\n");
		}
		
		
	}
}
