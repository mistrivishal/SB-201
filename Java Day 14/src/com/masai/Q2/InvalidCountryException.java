package com.masai.Q2;

public class InvalidCountryException extends Exception{
	
	InvalidCountryException(){
		
	}
	InvalidCountryException(String massage){
		super(massage);
	}
}
