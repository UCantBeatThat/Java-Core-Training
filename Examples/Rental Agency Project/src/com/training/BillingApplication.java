package com.training;

import com.training.services.ItemService;

public class BillingApplication {
	
	public static void main(String[] args) {
		
		int key = 1;
		int days = 10;
		int qty = 2;
		
		double totalRent = 0.0, itemRent = 0.0;
		
		ItemService service = new ItemService();
		
		itemRent = service.getItemRent(key, qty, days);
		
		System.out.println("Item1 Total = " + itemRent);
		System.out.println("-----------------------------------\n");
		
		totalRent += itemRent;
		
		// Repeat the following snippet
		key = 2;
		qty = 5;
		
		itemRent = service.getItemRent(key, qty, days);
		
		totalRent += itemRent;
		
		System.out.println("Item2 Total = " + itemRent);
		System.out.println("-----------------------------------\n");
		
		// snippet ends here till here
		
		key = 3;
		qty = 30;
		
		itemRent = service.getItemRent(key, qty, days);
		
		totalRent += itemRent;
		
		System.out.println("Item3 Total = " + itemRent);
		System.out.println("-----------------------------------\n");
		
		System.out.println("\nGrand Total = " + totalRent);
	}
}
