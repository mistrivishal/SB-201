package com.masai.Q2;

import java.util.*;

public class Library {
	
	List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully\n");
	}
	public  boolean isEmpty() {
		if(bookList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public List<Book> viewAllBooks(){
		return bookList;
	}
	
	List<Book> viewBooksByAuthor(String author ){
		List<Book> bks = new ArrayList<>();
		for(Book b:bookList) {
			if(b.getAuthor().equalsIgnoreCase(author)) {
				bks.add(b);
			}
		}
		return bks;
	}
	
	public int countNoOfBook(String bookName){
		int c = 0;
		for(Book b:bookList) {
			if(b.getBookName().equalsIgnoreCase(bookName)) {
				c++;
			}
		}
		return c;
	}
}
