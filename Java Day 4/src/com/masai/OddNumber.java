package com.masai;

import java.util.Scanner;

public class OddNumber {
	
	public void isOdd(int num) {
	
		if(num%2 != 0) {
			System.out.println(num);
		}else if(num%2 == 0) {
			System.out.println((num/10 + 1)*10);
		}else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		OddNumber odd = new OddNumber();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Number Below :");
		if(scan.hasNextInt()) {
			int input = scan.nextInt();
			System.out.println("Output :");
			odd.isOdd(input);
		}else {
			System.out.println("Enter valid input as a whole Number");
			
		}
				
	}
}
