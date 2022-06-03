package com.masai.Q2;

import java.util.Scanner;

public class Main {
	
	static boolean validate(String string) {
		if(string.matches("[a-zA-Z]{3,8}")) {
			return true;
		}
		else if(string.matches("[0-9]{12}")) {
			return true;
		}
		else if(string.matches("[6789][0-9]{9}")) {
			return true;
		}
		else
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter citizen details:");
		String name;
		String aadharNum;
		String mobileNum;
		System.out.println("Enter Name: ");
		name = sc.next();
		while(true) {
			if(Main.validate(name)){
				break;
			}else {
				System.out.println("Enter valid name: ");
				name = sc.next();
			}
		}
		System.out.println("Enter Aadhar Number: ");
		aadharNum = sc.next();
		while(true) {
			if(Main.validate(aadharNum)){
				break;
			}else {
				System.out.println("Enter valid Aadhar Number: ");
				aadharNum = sc.next();
			}
		}
		System.out.println("Enter Mobile Number: ");
		mobileNum = sc.next();
		while(true) {
			if(Main.validate(mobileNum)){
				break;
			}else {
				System.out.println("Enter valid Mobile Number: ");
				mobileNum = sc.next();
			}
		}
		
		Citizen c1 = new Citizen(name,aadharNum,mobileNum);
		
		System.out.println("\n*************************\n");
		
		System.out.println("Name of Citizen: " + c1.getName());
		System.out.println("Aadhar Number of Citizen: " + c1.getAadharNumber());
		System.out.println("Mobile Number of Citizen: " + c1.getMobileNumber());
		
		System.out.println("\n*************************\n");
	}
}
