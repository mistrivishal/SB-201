package com.masai.LibraryDao;

import java.util.List;

import com.masai.entityClass.*;
import com.masai.exceptions.*;

public interface LibraryDao {
	
	boolean addBook(Book book);
	boolean addGenre(Book_Genre bookGenre);
	List<Book> getBooksByGenre(String genre) throws GenreNotFound;
	String updateAuthorName(String bookName, String authorName) throws BookNotFound;
	void removeGenre(String genre) throws GenreNotFound;
	void removeBook(String bookName) throws BookNotFound;
}
