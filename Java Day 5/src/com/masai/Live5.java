package com.masai;

import java.util.Scanner;

public class Live5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("are you above 18?");
		Boolean _18 = scanner.nextBoolean();
		System.out.println("Age: "+_18);
		
		System.out.println("Enter temprature");
		Double temp = scanner.nextDouble();
		System.out.println("temp: "+temp);
		
		scanner.nextLine();
		System.out.println("Enter your full name");
		String name = scanner.nextLine();
		System.out.println("Your Name: "+name);
		
		
	}
}
