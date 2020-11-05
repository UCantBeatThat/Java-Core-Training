package com.training;

public class Book {
	
	private int bookNumber;
	private String bookTitle;
	private String author;
	private double ratePerUnit;
	
	
	public Book() {
		super();
		// this();
		// this(0, "dummy", "guest", 0.0);
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookNumber, String bookTitle, String author, double ratePerUnit) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
		this.ratePerUnit = ratePerUnit;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public String toString() {
		return "\nBook Details\n------------------\nBookNumber: " + this.getBookNumber() + "\nTitle: " + this.getBookTitle() 
			+ "\nAuthor: " + this.getAuthor() + "\nRate/Unit: Rs. " + this.getRatePerUnit();
	}
}
