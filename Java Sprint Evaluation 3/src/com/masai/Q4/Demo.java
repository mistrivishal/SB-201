package com.masai.Q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.next();
		while(true) {
			if(username.matches("[a-zA-Z]{3,8}")) {
				break;
			}else {
				System.out.println("error: enter valid username:");
				username = sc.next();
			}
		}
		
		System.out.println("Enter Password: ");
		String password = sc.next();;
		while(true) {
			if(password.matches("[A-Za-z0-9_]{3,8}")) {
				break;
			}else {
				System.out.println("error: enter valid password:");
				password = sc.next();
			}
		}
		
		System.out.println("Enter Mobile Number: ");
		String mobileNumber = sc.next();
		while(true) {
			
			if(mobileNumber.matches("[6789][0-9]{9}")) {
				break;
			}else {
				System.out.println("error: enter valid mobile number:");
				mobileNumber = sc.next();
			}
		}
		
		System.out.println("Enter email:");
		String email = sc.next();
		while(true) {
			
			if(email.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9.-]+[com,in]")) {
				break;
			}else {
				System.out.println("error: enter valid email:");
				email = sc.next();
			}
		}
		
		Customer c1 = new Customer(username, password, mobileNumber, email);
		System.out.println(c1);
	}
}
