package com.masai.EmpAddbean;

import java.util.*;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empID;
	private String name;
	private String gender;
	private int salary;

	@ElementCollection
	@Embedded
	@JoinTable(name = "Emp_Address", joinColumns = @JoinColumn(name = "emp_Id"))
	private Set<Address> empAddress = new HashSet<>();

	public Employee() {
		super();
	}

	public Employee(int empID, String name, String gender, int salary, Set<Address> empAddress) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Emp ID: " + empID + "\nName: " + name + "\nGender: " + gender + "\nSalary: " + salary + "\nAddress="
				+ empAddress;
	}

}
