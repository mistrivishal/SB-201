package com.masai.Q2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number students : ");
		int st = sc.nextInt();
		
		Student[] students = new Student[st];
		
		for(int i=0;i<students.length;i++) {
			System.out.println("Enter Student " + (i+1) + " Details: ");
			System.out.println("Enter student roll no.: ");
			int roll = sc.nextInt();
			System.out.println("Enter student name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Enter student address: ");
			String add = sc.nextLine();
			System.out.println("Enter student marks: ");
			int marks = sc.nextInt();
			students[i] = new Student(roll,name,add,marks);
			System.out.println("\n");
		}
		
		for(int j=0;j<students.length;j++) {
			System.out.println("\nStudent " + (j+1) + " Details: ");
			System.out.println("Roll No.: " + students[j].getRoll());
			System.out.println("Name: " + students[j].getName());
			System.out.println("Address: " + students[j].getAddress());
			System.out.println("Marks: " + students[j].getMarks());
		}
	}
}
