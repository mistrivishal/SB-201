package com.masai.useCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.UtilityEntity.UtilityEntity;
import com.masai.beanClasses.Department;
import com.masai.beanClasses.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EntityManager em = UtilityEntity.getEntityManager();
			
		//getting input from user:-
		
		System.out.println("Enter Department name:");
		String dname = sc.next();
		
		System.out.println("Enter Department location:");
		String loc = sc.next();
		
		Department d = new Department();
		d.setDname(dname);
		d.setLocation(loc);
		
		
		System.out.println("Assing the three employees to the department:");
		
		int x = 0;
		
		while(x<3) {
		
			System.out.println("Enter Employee Name");
			String name = sc.next();
			
			System.out.println("Enter Employee Address");
			String add = sc.next();
			
			System.out.println("Enter Employee Salary");
			int salary = sc.nextInt();
			
			Employee e  = new Employee();
			e.setEname(name);
			e.setAddress(add);
			e.setSalary(salary);
			e.setDept(d);		
			
			d.getEmps().add(e);
			
			System.out.println((x+1) + " Employee assing to :- " + dname + " Department");
			
			x++;
		}
	
		em.getTransaction().begin();
		
		em.persist(d);
		
		em.getTransaction().commit();
			
		System.out.println("Employee details saved successfully...");
		
		em.close();
	}
}
