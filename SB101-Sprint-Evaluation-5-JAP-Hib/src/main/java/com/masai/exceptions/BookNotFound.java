package com.masai.exceptions;

public class BookNotFound extends Exception{
	
	public BookNotFound() {
		
	}
	
	public BookNotFound(String msg) {
		super(msg);
	}
}