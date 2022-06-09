package com.masai.Q1;

public class InsufficientFundsException extends Exception{
	
	InsufficientFundsException(){
		
	}
	InsufficientFundsException(String massage){
		super(massage);
	}
}
