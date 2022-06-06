package com.masai.Q1;

import java.util.Scanner;

public class ArrayIndexInputOutput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter the number of elements in the array");
		try {	
			int[] arr = new int[sc.nextInt()];
		
			System.out.println("Enter the elements in the array");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the element " + (i+1));
				arr[i] = sc.nextInt();
			}			
		
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		catch(Exception e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
