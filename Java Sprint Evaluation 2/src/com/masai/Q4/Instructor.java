package com.masai.Q4;

public class Instructor extends Person{
	
	int instructorId;
	int salary;
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nInstructor Id: " + instructorId + "\nInstructor Name: " + name + "\nInstructor Gender: " + gender + "\nInstructor Salary: " + salary + 
				"\nInstructor Address: \n" + "City: " + add.city + "\nState: " + add.state + "\nPin Code: " + add.pinCode; 
	}
	
	
}
