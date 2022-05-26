package com.masai;

import java.util.Arrays;

import java.util.Scanner;

public class ReverseString {
	
	public static String reversString(String input){
		int n = input.length();
		char[] rev = new char[n];
		for(int i=0;i<n;i++) {
			rev[n-i-1] = input.charAt(i);
		}
		
		return String.copyValueOf(rev);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse: ");
		String originalString = sc.next();
		
		String result = ReverseString.reversString(originalString);
		
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		
	}

}
