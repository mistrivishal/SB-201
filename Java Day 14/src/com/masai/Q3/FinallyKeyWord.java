package com.masai.Q3;

public class FinallyKeyWord {
	

//	Finally is the key word used with the try-catch block
//	A finally block contains all the important statements 
//	that must be executed whether exception occurs or not. 
//	The statements present finally block will always execute 
//	regardless of whether exception occurs in try block or not 
//	Finally block not work in following cases:-
//	1. until when if we cannot use the System. exit() method to
//	   terminate the application forcefully.
//	2. if there is no error or exception in the finally block.
//	3. Emergency power cut of the system
	
	
	public static void main(String[] args) {
		System.out.println("Start of main");
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		finally {
			System.out.println("We can right imp statement here");
		}
		
		System.out.println("End of main");
	}
}
