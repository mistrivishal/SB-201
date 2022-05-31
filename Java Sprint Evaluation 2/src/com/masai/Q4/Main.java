package com.masai.Q4;

import java.util.Scanner;

public class Main {

	public static Person generatePerson(Person person) {
		Scanner sc = new Scanner(System.in);
		
		if(person instanceof Student) {
			Student std = (Student)person;
			
			System.out.println("Enter Student name: ");
			std.setName(sc.next());
			
			System.out.println("Enter Student gender: ");
			std.setGender(sc.next());
			
			System.out.println("Enter Student ID: ");
			std.setStudentId(sc.nextInt());
			
			System.out.println("Enter Course Enroll ID: ");
			std.setCourseEnrolled(sc.next());
			
			System.out.println("Enter Course Fee: ");
			std.setCourseFee(sc.nextInt());
			
			System.out.println("Enter Student Address: ");
			Address add = new Address();
			
			System.out.println("Enter City: ");
			add.setCity(sc.next());
			
			System.out.println("Enter State: ");
			add.setState(sc.next());
			
			System.out.println("Enter Pin Code: ");
			add.setPinCode(sc.next());
			
			std.setAdd(add);
			
			return std;
			
		}else {
			Instructor ins = (Instructor)person;
			
			System.out.println("Enter Instructor name: ");
			ins.setName(sc.next());
			
			System.out.println("Enter Instructor gender: ");
			ins.setGender(sc.next());
			
			System.out.println("Enter Instructor ID: ");
			ins.setInstructorId(sc.nextInt());
			
			System.out.println("Enter Instructor Salary: ");
			ins.setSalary(sc.nextInt());
			
			System.out.println("Enter Instructor Address: ");
			Address add = new Address();
			
			System.out.println("Enter City: ");
			add.setCity(sc.next());
			
			System.out.println("Enter State: ");
			add.setState(sc.next());
			
			System.out.println("Enter Pin Code: ");
			add.setPinCode(sc.next());
			
			ins.setAdd(add);
			
			return ins;
		}
	}
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
}
