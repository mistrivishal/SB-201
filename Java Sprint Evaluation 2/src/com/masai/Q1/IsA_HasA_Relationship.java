package com.masai.Q1;

public class IsA_HasA_Relationship {
	
	
	//In OOp's there are two concepts which are mostly used are:-
	//1. IS-A Relationship;
	//2. HAS-A Relationship;
	
	// Difference:-
	
//						IS-A													HAS-A
//	1. When one class extends another class 			1. Where as the HAS-A relationship are referring to the  
//	   it means it applies the IS-A relationship		   composition of two classes.
//	   with other class
//	2. When IS-A applies i.e. There is Inheritance		2. There is no such key like "extends", simply 
//	   takes place, When Child class extends to the		   one class can use the instance variables , method 
//	   parent class by key word "extends"				   from another class;
//	3. When there is IS-A relationship the Child class	3. In HAS-A relationship the one class can access the 
//	   Inherits the properties of the child class i.e.	   the instance variables and methods by creating the  
//	   all methods and the variables which are present     Object of one class in another class using "new" key word
//	   in parent class is available to the child also.
	
	
	
	public static void main(String[] args) {
		
		//IS-A relationship Example:-
		B p1 = new B();
		p1.method1();
		
		//Has-A relationship Example:-
		//between class A and IsA_HasA_Relationship;
		A A1 = new A();
		A1.method1();
	}
		
}
 class A{
	 void method1() {
		 System.out.println("Its IS-A relationship between Class A and Class B");
	 }
 }
 class B extends A{
	 //there is no method is return in the class be but it contains the parent class method
 }