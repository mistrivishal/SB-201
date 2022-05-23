package com.masaiEvaluation;

public class Main {
	public static void main(String[] args) {
		
		//using zero parameter constructor;
		
		System.out.println("using zero parameter constructor:" + "\n");
		Car car1 = new Car();
		car1.setModel("Harrier");
		car1.setCompanyName("Tata");
		car1.setColor("Black");
		car1.setEngine(true);
		car1.carDetails(1000, 110, "tata", true);
		
		System.out.println("\n");
		
		//using Parameter Constructor;
		System.out.println("using Parameterised Constructor:" + "\n");
		
		Car car2 = new Car("Harrier","Tata","Black",true);
		
		car2.carDetails(1000, 110, "tata", true);
	}
}
