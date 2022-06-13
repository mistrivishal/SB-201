package com.masai.Q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class VoteEligibility {
	
	public static void validVote(String userDOB) throws InvalidAgeException {
		
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate today = LocalDate.now();
			LocalDate uDOB = LocalDate.parse(userDOB,dtf);
			if(uDOB.isBefore(today)) {
				int age = today.getYear() - uDOB.getYear();
				if(age >=18) {
					if(uDOB.getMonth() == today.getMonth() && uDOB.getDayOfMonth() == today.getDayOfMonth()) {
						System.out.println("Happy Birthday, You are eligible to cast your vote.");
					}
					else {
						System.out.println("You are eligible to cast your vote");
					}
				}
				else{
					System.out.println("You are not eligible to cast your vote");
				}
			}
			else {
				InvalidAgeException iae = new InvalidAgeException("Date of birth should not be in future");
				throw iae;
			}
		}
		catch(DateTimeParseException dte) {
			System.out.println("please pass the date in the proper format");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter your Date of birth:");
			String userDOB = sc.next();
			
			VoteEligibility.validVote(userDOB);
		}
		catch(InvalidAgeException iae) {
			System.out.println(iae.getMessage());
		}
	}
}
