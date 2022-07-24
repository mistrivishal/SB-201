package com.masai.useCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.entityClasses.Address;
import com.masai.entityClasses.Employee;
import com.masai.utilEntity.UtilEntity;

public class addEmployee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EntityManager em = UtilEntity.getEntityManager();

		System.out.println("Insert 4 Employee record ");
		boolean yes = true;

		while (yes) {

			Employee e = new Employee();

			System.out.println("Enter employe name:");
			String name = sc.next();
			e.setName(name);

			System.out.println("Enter employee salary;");
			int salary = sc.nextInt();
			e.setSalary(salary);

			String type = "Home";

			int i = 0;

			while (i < 2) {
				System.out.println("Enter " + type + " address of employee:");

				System.out.println("Enter state:");
				String state = sc.next();

				System.out.println("Enter city:");
				String city = sc.next();

				System.out.println("Enter pincode:");
				String pincode = sc.next();

				if (type.equalsIgnoreCase("Home")) {
					e.setHomeAddress(new Address(state, city, pincode));
				} else {
					e.setOfficeAddress(new Address(state, city, pincode));
				}

				type = "Office";
				i++;
			}

			em.getTransaction().begin();

			em.persist(e);

			em.getTransaction().commit();

			System.out.println("Enter Y to add another employee/ Else press any to exit:");
			if (!sc.next().equalsIgnoreCase("y")) {
				break;
			}
		}

		System.out.println("Employee Data inserted succeefully...");

		em.close();
	}
}
