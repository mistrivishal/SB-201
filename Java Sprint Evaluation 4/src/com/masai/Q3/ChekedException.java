package com.masai.Q3;

public class ChekedException extends Exception{
	
	ChekedException(String m){
		super(m);
	}
	ChekedException(){
		
	}
	//Checked exception are those occurs during the execution of the application i.e. at runtime;
	//Checked exception are checked at time of compilation;
	//user can create their own checked exception by creating the class which extends the "Exception" class;
	//to catch the this type of exception use of the "throw" and "throws" are implemented;
	//to define the exception its has to be mention in the method declaration;
}
