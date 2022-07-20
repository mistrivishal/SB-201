package com.masai.UseCase;

import java.util.Scanner;
import javax.persistence.EntityManager;
import com.masai.EmpAddbean.*;
import com.masai.UtilityEntity.UtilityEntity;



public class InsertEmployeeRecords {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Address setAddress(String type) {
		
		
		Address a = new Address();
		
		System.out.println("Sate:");
		String state = sc.next();
		
		System.out.println("City:");
		String city = sc.next();
		
		System.out.println("Pincode:");
		String pincode = sc.next();
		
		if(type.equalsIgnoreCase("H"))
			a = new Address(state, city, pincode, "Home");
		else
			a = new Address(state, city, pincode, "Office");
		
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
		EntityManager em = UtilityEntity.getEntityManager();
		
		int i=0;
		System.out.println("Enter Four Employee Records");
		
		while (i < 4) {
			
			//getting input from user:-
			
			System.out.println("Enter Employee Name");
			String name = sc.next();
			
			System.out.println("Enter Employee Gender");
			String gender = sc.next();
			
			System.out.println("Enter Employee Salary");
			int salary = sc.nextInt();
			
			//Creating Employee class from input:-
			
			Employee e = new Employee();

			e.setName(name);
			e.setGender(gender);
			e.setSalary(salary);
			
			System.out.println("Enter Employee Address Details");
			
			System.out.println("Enter Home Address");
			
			Address ha = InsertEmployeeRecords.setAddress("H");
			
			e.getEmpAddress().add(ha);
			
			System.out.println("Enter Office Address");
			
			Address oa = InsertEmployeeRecords.setAddress("O");
			
			e.getEmpAddress().add(oa);
			
			
			//persisting/Saving the employee object in to DB:-
			
			em.getTransaction().begin();
			
			em.persist(e);
			
			em.getTransaction().commit();
			
			System.out.println((i+1) + " Employee data saved..");
			
			i++;
		}
		
		System.out.println("Employee details saved successfully...");
		
		em.close();
	}
}
