package com.training;

public class AuthorApplication {

	public static void main(String[] args) {

		
		
		ManageAuthors authorManager = new ManageAuthors();
		
		Author ram = new Author(104, "Ramesh",8494949, "ram@abc.com");

		 boolean status = authorManager.write(ram);
		 
		 if(status) {
			 
			 System.out.println("Author Added");
		 } else {
			 
			 System.out.println("Exception - Try again");
		 }

		
		//  System.out.println(authorManager.read());
		  
		  
	}

}
