package com.masai.entityClass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book_Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int genreid;
	private String genre_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Book> bookList = new ArrayList<Book>();

	
	
	public Book_Genre() {
		super();
	}

	public Book_Genre(int genreid, String genre_name, List<Book> bookList) {
		super();
		this.genreid = genreid;
		this.genre_name = genre_name;
		this.bookList = bookList;
	}

	public int getGenreid() {
		return genreid;
	}

	public void setGenreid(int genreid) {
		this.genreid = genreid;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Book_Genre \nGenreid: " + genreid + ", Genre_name: " + genre_name + ", BookList: " + bookList;
	}
	
	
}
