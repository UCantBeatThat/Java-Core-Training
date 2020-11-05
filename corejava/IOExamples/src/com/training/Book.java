package com.training;

import java.io.Serializable;

public class Book implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 121L;
	private long bookNumber;
	private String bookName;
	private  double price;
	
	// book is a author - wrong relationShop
	
	// book has a author - correct relation - has a relationship

	private Author author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long bookNumber, String bookName, double price, Author author) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", price=" + price + ", author=" + author
				+ "]";
	}
	
	
}
