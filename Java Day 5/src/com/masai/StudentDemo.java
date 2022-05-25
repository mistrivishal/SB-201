package com.masai;

import java.util.Scanner;

public class StudentDemo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No. of students: ");
		int noOfStudents = scan.nextInt();
		Student[] studentArr = new Student[noOfStudents];
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter Student number " + (i+1) + " details:");
			System.out.println("Enter student roll number: ");
			int roll = scan.nextInt();
			System.out.println("Enter student name: ");
			String name = scan.next();
			System.out.println("Enter student address: ");
			scan.nextLine();
			String address = scan.nextLine();
			System.out.println("Enter student marks: ");
			int marks = scan.nextInt();
			studentArr[i] = new Student(roll,name,address,marks);
			System.out.println("===============================");
		}
		int i = 1;
		for(Student item: studentArr) {
			System.out.println("Student No.: " + i++);
			System.out.println("Roll No.: " + item.getRoll());
			System.out.println("Name: " + item.getName());
			System.out.println("Address: " + item.getAddress());
			System.out.println("Marks: " + item.getMarks());
			System.out.println("*******************************");
		}
				
	}
}
