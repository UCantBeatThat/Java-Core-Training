package com.training;

public class Book {

	private long bookId;
	private String bookName;
	private String author;
	private String category;
	private double price;
	
	// Zero Argument Constructor
	
	static {
		
		System.out.println("Inside static  block");
	}
	public Book() {
		super();
		
		System.out.println("Inside Constructor");
	}

	// 5 Parameter overloaded constructor
	public Book(long bookId, String bookName, String author, String category, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// 4 Parameter overloaded  Constructor 
	
		public Book(long bookId, String bookName, String author, String category) {

			this(bookId,bookName,author,category,10);
			
			
	}

	public long getBookId() {
		return bookId;
	}

	
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
