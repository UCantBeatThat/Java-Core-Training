package com.training;

public class Application {

	public static void main(String[] args) {

		
		
		PeristanceManager mgr = new PeristanceManager();
		
		int choice = 2;
		
		if(choice ==1) {
		
		Author ram = new Author(101, "Ramesh",9494949, "ram@abc.com");
		
		Book javaBook = new Book(220, "Mastering Java", 1870.00, ram);
		
		boolean status = mgr.save(javaBook);
		
		 if(status) {
			 System.out.println("One Book Persisted");
		 } else {
			 System.out.println("Exception - Try again");
		 }

		} else {
		System.out.println(mgr.load());
		
		}
	}

}
