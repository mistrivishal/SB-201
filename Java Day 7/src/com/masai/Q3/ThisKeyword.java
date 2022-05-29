package com.masai.Q3;

public class ThisKeyword {

	//The this keyword refers to the current object in a method or constructor.
	//"this" can be used to refer the integer belongs to current object;
	//"this" can be used to invoke current class method (implicitly).
	//"this()" can be used to invoke current class constructor.
	
	int x = 10;
	String name  = "sam";
	
	public ThisKeyword() {
		System.out.println("This from empty ");
	}
	public ThisKeyword(String name) {	
		this();
		this.name = name;
		System.out.println("This from string " + name);
	}
	public ThisKeyword(int x) {
		this("sam");
		this.x = x;
		System.out.println("This from integer " + x);
	}
	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword(10);
	}
}
