package com.masai.Q3;

import java.util.Scanner;

public class Demo {
	
	public void printCity(City city){
		
	if(city != null){
		System.out.println("our service is available ");
		
		city.message();
		
		System.out.println(city.numberofTowers);
		
		
	}
	else
		System.out.println("invalid city");
	
}

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the City");
		String cityName= sc.next();
		
		City c= City.valueOf(cityName);
		
		
		d1.printCity(c);	
		
		
	}

}
