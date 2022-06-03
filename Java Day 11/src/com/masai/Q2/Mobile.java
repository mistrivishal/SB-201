package com.masai.Q2;

import java.util.Scanner;

public class Mobile {
	
	static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void searchOutdatedModel(String []...modelNo){
		
		if(modelNo!=null) {
			
			for (String outdatedModel : outdatedModels) {
				for(String[] x : modelNo) {
					if(x[1].equalsIgnoreCase(outdatedModel)) {
						
						System.out.println(x[0] + " " + x[1] + "_OUTDATED");
						System.out.println("\n********************************\n");
						break;
						
					}else {
						
						System.out.println(x[0] + " " + x[1] + "_NOT_OUTDATED");
						System.out.println("\n********************************\n");
						break;
						
					}
				}
			}
		}
		else{
			System.out.println("Please Enter Valid Model Number");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how number models you have to check: ");
		int num;
		while(true) {
			num = sc.nextInt();
			if(num<=5) {
				break;
			}else {
				System.out.println("You can only check maximum 5 mobiles:");
				System.out.println("Enter valid number:");
			}
		
		}
		String[][] models = new String[num][1];
		
		System.out.println("Enter Mobile details: ");

		for(int i=0;i<models.length;i++) {
			System.out.println("Enter Mobile No. " + (i+1));
			
			System.out.println("Enter Mobile Company: ");
			String comapny = sc.next();
			System.out.println("Enter Mobile Model Number: ");
			String model = sc.next();
			
			String[] m = {comapny,model};
			models[i] = m;
			System.out.println("\n********************************\n");
		}
		
		//Outdated mobile search method call with var args:-
		
		Mobile.searchOutdatedModel(models);
	}
}
