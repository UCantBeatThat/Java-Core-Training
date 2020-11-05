package com.training;

public class ReviewService {

	
	private static String reviewerName = "Masand";

	// Using static variable and methods
	
	public double review(Book book )  { // book is parameter variable
		
	//	System.out.println("Reviwed by"+ this.reviewerName);  
		// static field should not be accessed with "this"
		// it should be accessed with ClassName
		
		// we can access static variable in the instance method
		System.out.println("Reviwed by"+ ReviewService.reviewerName);
		
		
		double rating = 3.5;  // Local Variable 
		if(book.getBookName().equals("Head First Java") ){
			
			rating = 4.3;
		} 
		
		return rating;
	}
	
	// Overloaded Method  - Name is same but argument is different
	protected double review(Movie movie) {
		
		double rating = 2.5;
		
		if(movie.getMovieId() <=100) {  // range check should include boundary conditions
			
			rating = 3.6;
		} else if(movie.getMovieId() >100 && movie.getMovieId()<200) {
			
			rating = 3.8;
		}
		
		return rating;
	}
	
	public static String getDetails() {
		
		// Non static variables CANNOT be accessed in static method
		//String details = this.movieName + reviewerName;
		
		String details =reviewerName;
		
		return details;
		
	}
}
