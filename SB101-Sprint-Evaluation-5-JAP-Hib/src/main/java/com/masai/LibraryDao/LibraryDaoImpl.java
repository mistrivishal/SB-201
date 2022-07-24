package com.masai.LibraryDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entityClass.Book;
import com.masai.entityClass.Book_Genre;
import com.masai.exceptions.BookNotFound;
import com.masai.exceptions.GenreNotFound;
import com.masai.utility.UtilEntity;

public class LibraryDaoImpl implements LibraryDao {

	public boolean addBook(Book book) {
		boolean x = false;

		EntityManager em = UtilEntity.getEntityManager();

//		Book_Genre bg = new Book_Genre();
//		bg.setGenre_name("comdey");
//		bg.getBookList().add(book);

		em.getTransaction().begin();

		em.persist(book);

		x = true;

		em.getTransaction().commit();

		em.close();

		return x;
	}

	public boolean addGenre(Book_Genre bookGenre) {
		boolean x = false;

		EntityManager em = UtilEntity.getEntityManager();

		em.getTransaction().begin();

		em.persist(bookGenre);

		x = true;

		em.getTransaction().commit();

		em.close();

		return x;
	}

	public List<Book> getBooksByGenre(String genre) throws GenreNotFound {

		List<Book> books = null;

		EntityManager em = UtilEntity.getEntityManager();

//		books = em.createQuery("from Book_Genre where genre_name = ")

		return books;

	}

	public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
		String s = "Not updated";
		
		EntityManager em = UtilEntity.getEntityManager();

		Query q = em.createQuery("select from book where book_name = b");

		q.setParameter(bookName, "b");

		Book b = (Book) q.getSingleResult();
		
		if (b != null) {
			em.getTransaction().begin();
			
			b.setAuthor_name(authorName);
			
			em.merge(b);

			em.getTransaction().commit();

			System.out.println("updated....");
		} 
		else {
			throw new BookNotFound("BookNotFound");
		}
		
		return s;
	}

	public void removeGenre(String genre) throws GenreNotFound {
		// TODO Auto-generated method stub

		EntityManager em = UtilEntity.getEntityManager();

		Query q = em.createQuery("select from Book_Genre where genre_name = gen");

		q.setParameter(genre, "gen");

		Book_Genre bg = (Book_Genre) q.getSingleResult();

		if (bg == null) {
			throw new GenreNotFound("GenreNotFound");
		} else {

			em.getTransaction().begin();

			em.remove(bg);

			em.getTransaction().commit();

			System.out.println("removed....");

			System.out.println("removed....");
		}
	}

	public void removeBook(String bookName) throws BookNotFound {
		// TODO Auto-generated method stub

		EntityManager em = UtilEntity.getEntityManager();

		Query q = em.createQuery("select from book where book_name = b");

		q.setParameter(bookName, "b");

		Book b = (Book) q.getSingleResult();

		if (b == null) {
			throw new BookNotFound("BookNotFound");
		} else {

			em.getTransaction().begin();

			em.remove(b);

			em.getTransaction().commit();

			System.out.println("removed....");
		}
	}

}
