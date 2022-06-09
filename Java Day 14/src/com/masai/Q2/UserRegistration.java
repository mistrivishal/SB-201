package com.masai.Q2;

import java.util.Scanner;

public class UserRegistration {
	
	static void registerUser(String username,String userCountry) throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}else {
			InvalidCountryException ivc = new InvalidCountryException("User Outside India cannot be registered");
			throw ivc;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		
		System.out.println("Enter Your Country: ");
		String country = sc.next();
		
		try {
			UserRegistration.registerUser(name, country);
		} catch (InvalidCountryException ivc) {
			System.out.println(ivc.getMessage());
		}
		
	}
}
