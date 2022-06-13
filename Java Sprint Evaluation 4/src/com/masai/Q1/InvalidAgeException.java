package com.masai.Q1;

public class InvalidAgeException extends Exception{

	InvalidAgeException(){
		
	}
	InvalidAgeException(String massage){
		super(massage);
	}
}
