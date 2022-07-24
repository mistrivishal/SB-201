package com.masai.useCases;

import java.util.Date;

import com.masai.LibraryDao.*;
import com.masai.entityClass.Book;

public class addBook {
	
	
	public static void main(String[] args) {
		
		LibraryDao ld = new LibraryDaoImpl();
		
		Book b = new Book();
		b.setBook_name("XYZ");
		b.setAuthor_name("Lala");
		
		b.setPublished_date(new Date(12-22-1922));
		
		boolean a = ld.addBook(b);
		
		if(a) {
			System.out.println("Added succefully..");
		}else {
			System.out.println("Not Added..");
		}
		
	}
}
