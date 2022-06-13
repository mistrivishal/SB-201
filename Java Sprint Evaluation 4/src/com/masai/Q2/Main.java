package com.masai.Q2;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		boolean bo = true;
		while(bo) {
			System.out.println("1.Add Book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Count number of books - by book name");
			System.out.println("5.Exit\n");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("Enter the isbn no:");
					int isbn = sc.nextInt();
					System.out.println("Enter the book name:");
					String name = sc.next();
					System.out.println("Enter the author name:");
					sc.nextLine();
					String author = sc.nextLine();
					Book b = new Book(isbn, name, author);
					l.addBook(b);
					break;
				case 2:
					if(!l.isEmpty()) {
						List<Book> bk = l.viewAllBooks();
						for(Book b1:bk) {
							System.out.println(b1);
						}
					}else {
						System.out.println("No books in the Library");
					}
					break;
				case 3:
					if(!l.isEmpty()) {
						System.out.println("Enter the author name:");
						sc.nextLine();
						String a = sc.nextLine(); 
						List<Book> sb = l.viewBooksByAuthor(a);
						if(sb != null) {
							System.out.println(sb);
						}
						else{
							System.out.println("None of the book published by the author " + a);
						};
					}else {
						System.out.println("No books in the Library");
					}
					break;
				case 4:
					if(!l.isEmpty()) {
						System.out.println("Enter book name: ");
						String bName = sc.next();
						System.out.println("There are: " + l.countNoOfBook(bName) + " searches for -" + bName);
					}else {
						System.out.println("No books in the Library");
					}
					break;
				default:
					bo = false;
					break;
				}
		}
		System.out.println("Thank You For Visiting the Library..!!");
	}
}
