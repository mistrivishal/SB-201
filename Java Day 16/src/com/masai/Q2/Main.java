package com.masai.Q2;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Employee> ts = new TreeSet<>(new EmployeeSortingPrice());
				
		int i = 1;
		while(i<=4) {
			System.out.println("Enter Employee ID: ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String name = sc.next();
			System.out.println("Enter Employee salary: ");
			double salary =  sc.nextDouble();
			
			ts.add(new Employee(id, name, salary));
			i++;
		}
		
		
		
		System.out.println(ts);
	}
}
