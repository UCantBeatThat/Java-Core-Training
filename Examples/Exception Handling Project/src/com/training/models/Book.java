package com.training.models;

import com.training.exceptionstore.MyCustomException;

public class Book {
	
	private int bookID;
	private String bookName;
	private String authorName;
	private double price;
	
	private static final String RANGE_EXCEPTION_MESSAGE = "Please Enter Valid Price. Book Price should be between Rs. 100 and Rs. 500.";
	private static final String NULL_EXCEPTION_MESSAGE = "Please Enter Valid Name. Value entered is null.";
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookID, String bookName, String authorName, double price) throws MyCustomException {
		super();
		this.bookID = bookID;

		try {
			if(bookName != null) {
				this.bookName = bookName;
			}
			else {
				throw new MyCustomException(NULL_EXCEPTION_MESSAGE);
			}
		}
		catch(MyCustomException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			if(price >= 100 && price <= 500) {
				this.price = price;
			}
			else {
				throw new MyCustomException(RANGE_EXCEPTION_MESSAGE);
			}
		}
		catch(MyCustomException e) {
			System.err.println(e.getMessage());
		}
		
		this.authorName = authorName;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		
		try {
			if(bookName != null) {
				this.bookName = bookName;
			}
			else {
				throw new MyCustomException(NULL_EXCEPTION_MESSAGE);
			}
		}
		catch(MyCustomException e) {
			System.err.println(e.getMessage());
		}
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price){
		try {
			if(price >= 100 && price <= 500) {
				this.price = price;
			}
			else {
				throw new MyCustomException(RANGE_EXCEPTION_MESSAGE);
			}
		}
		catch(MyCustomException e) {
			System.err.println(e.getMessage());
		}
	}
}
