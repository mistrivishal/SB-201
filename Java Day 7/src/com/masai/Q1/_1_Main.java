package com.masai.Q1;

public class _1_Main {
	public static void main(String[] args) {
		
		System.out.println("==========Employee============");
		
		_1_Member emp = new _1_Employee();
				
		emp.name = "Vikas";
		emp.age = 24;
		emp.phoneNumber = "999999999";
		emp.address = "TamilNadu";
		emp.salary = 20000;
		((_1_Employee) emp).specialisation = "Backend Engg";
		((_1_Employee) emp).department = "Backend";
		
		System.out.println("Name: " + emp.name);
		System.out.println("Age: " + emp.age);
		System.out.println("Phone Number: " + emp.phoneNumber);
		System.out.println("Address: " + emp.address);
		emp.printSalary();
		System.out.println("Specialisation: " + ((_1_Employee) emp).specialisation);
		System.out.println("Department: " + ((_1_Employee) emp).department);
		
		System.out.println("==========Manager============");
		
		_1_Member emp2 = new _1_Manager();
		
		emp2.name = "Lala";
		emp2.age = 28;
		emp2.phoneNumber = "8888888888";
		emp2.address = "Benguluru";
		emp2.salary = 25000;
		
		((_1_Manager) emp2).specialisation = "HR Manager";
		((_1_Manager) emp2).department = "HR";
		
		System.out.println("Name: " + emp2.name);
		System.out.println("Age: " + emp2.age);
		System.out.println("Phone Number: " + emp2.phoneNumber);
		System.out.println("Address: " + emp2.address);
		emp2.printSalary();
		System.out.println("Specialisation: " + ((_1_Manager) emp2).specialisation);
		System.out.println("Department: " + ((_1_Manager) emp2).department);
	}
}
