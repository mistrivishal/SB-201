package com.masai.Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
				
		int i = 1;
		while(i<=4) {
			System.out.println("Enter product ID: ");
			int id = sc.nextInt();
			System.out.println("Enter product Name: ");
			String name = sc.next();
			System.out.println("Enter product price: ");
			double price =  sc.nextDouble();
			
			list.add(new Product(id, name, price));
			i++;
		}
		
		while(true) {
			System.out.println("Enter 1 for sorting the product according to the productPrice");
			System.out.println("ENter 2 for sorting the product according to the productName");
			System.out.println("Enter 3 for sorting the product according to the productId");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					Collections.sort(list,new ProductSortingPrice());
					break;
				case 2:
					Collections.sort(list,new ProductSortingName());
					break;
				case 3:
					Collections.sort(list,new ProductSortingID());
					break;
				default:
					Collections.sort(list,new ProductSortingID());
					break;
			}
					
			System.out.println(list);
		}
	}
}
