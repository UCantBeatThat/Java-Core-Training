package com.training;

import com.training.models.Book;
import com.training.services.BookService;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service = new BookService();
		
		Book book1;
		try {
			book1 = new Book(101, "Java JEE", "Srivatsan", 219.99);
		}
		catch(Exception e) {
			book1 = null;
		}
		
		service.addBook(book1);
		
		service.getAllBooks();
		
		if(service.getOne(101)) {
			System.out.println("Book with ID: 101 found");
		}
	}

}
