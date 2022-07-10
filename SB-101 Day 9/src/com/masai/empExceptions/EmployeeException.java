package com.masai.empExceptions;

public class EmployeeException extends Exception{
		
	public EmployeeException() {
		
	}
	
	public EmployeeException(String massage){
		super(massage);
	}
}
