package com.training;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book headFirst = new Book();
		
		Book spring = new Book(101, "Spring in Action", "Vicky", 210.99);
		
		Book jee = new Book();
		
		jee.setBookNumber(102);
		jee.setBookTitle("Java Enterprise Edition");
		jee.setAuthor("Suresh");
		jee.setRatePerUnit(100.12);
		
//		System.out.println(spring.getAuthor());
//		System.out.println(spring.getRatePerUnit());
//		
//		System.out.println(headFirst.getAuthor());
//		System.out.println(headFirst.getRatePerUnit());
//
//		System.out.println(jee.getAuthor());
//		System.out.println(jee.getRatePerUnit());
		
		System.out.println(headFirst.toString());
		System.out.println(spring.toString());
		System.out.println(jee.toString());
	}

}
