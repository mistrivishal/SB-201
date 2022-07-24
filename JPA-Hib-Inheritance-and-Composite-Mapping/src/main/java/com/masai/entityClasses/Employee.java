package com.masai.entityClasses;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="eid")
public class Employee extends Person{
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
		@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
		@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
		
	})
	private Address homeAddress;
	
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
		
	})
	private Address officeAddress; 
	private int salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(Address homeAddress, Address officeAddress, int salary) {
		super();
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.salary = salary;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}	
	
	
}
