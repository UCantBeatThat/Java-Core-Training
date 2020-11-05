package com.training;

public class Application {

	public static void main(String[] args) {

		Book dummy = new Book();
		
		System.out.println(dummy.getPrice());

		// Returns the Class Loader used to Load Book  Class 
		System.out.println(dummy.getClass().getClassLoader());
		
		Movie saaho = new Movie(100, "Saaho", 4 ,600000);

		
		Book headFirst = new Book(202,"Head First Java","Kathy Sierra","Computer",340.00);
		
		ReviewService service = new ReviewService();
		int key = 2;
		
		switch (key) {
		
		case 1:
			System.out.println(service.review(headFirst));
			break;
		case 2:
			 System.out.println(service.review(saaho));
			 System.out.println(ReviewService.getDetails());
			 break;
		default:
			System.out.println("Invalid Choice -Try again");
		}
	}

}
