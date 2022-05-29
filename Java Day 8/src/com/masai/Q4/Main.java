package com.masai.Q4;

public class Main {
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		

		for(int i=0;i<animals.length;i++) {
			System.out.println("*******************");
			animals[i].makeNoise();
			animals[i].eat();
			animals[i].walk();
			System.out.println("\n");
		}
	}
}
