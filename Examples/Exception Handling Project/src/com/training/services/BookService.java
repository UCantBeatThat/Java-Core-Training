package com.training.services;

import java.util.NoSuchElementException;

import com.training.models.Book;

public class BookService {
	
	private Book[] bookList;
	private static int arraySize = 2;
	private static int indexPos = 0;
	
	public BookService() {
		super();
		bookList = new Book[arraySize];
	}
	
	public boolean addBook(Book book) {
		boolean result = false;
		if(book.getBookName() != null && (int)book.getPrice() != 0) {
			if(indexPos < arraySize) {
				this.bookList[indexPos++] = book;
				result = true;
			}
			else if(indexPos == arraySize) {
				Book[] tempCardList = new Book[arraySize*2];
				System.arraycopy(bookList, 0, tempCardList, 0, arraySize);
				arraySize *= 2;
				bookList = tempCardList;
				this.bookList[indexPos++] = book;
				result = true;
			}
			System.out.println(this.bookList.length);
		}
		return result;
	}
	
	public void getAllBooks() {
		int i = 1;
		for(Book eachBook:this.bookList) {
			if(eachBook != null) {
				System.out.println("\nBook " + i++ + "\n----------\nBook ID: " + eachBook.getBookID()
					+ "\nBook Name: " + eachBook.getBookName()
					+ "\nAuthor Name: " + eachBook.getAuthorName()
					+ "\nPrice: " + eachBook.getPrice());
			}
		}
	}
	
	public boolean getOne(int bookID) {
		
		try {
			for(Book eachBook:this.bookList) {
				if(eachBook != null && eachBook.getBookID() == bookID) {
					return true;
				}
			}
				throw new NoSuchElementException("NoSuchElementException: Book ID - " + bookID + " is not found.");
		}
		catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
	
}
