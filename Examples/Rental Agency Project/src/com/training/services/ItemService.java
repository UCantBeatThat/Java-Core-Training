package com.training.services;

import com.training.models.*;

public class ItemService {
	
	// private
	private RentItem computers;
	private RentItem furnitures;
	private RentItem desk;
	
	public ItemService() {
		super();
		computers = new Computer("HP", 100, 39420.59);
		furnitures = new Furniture("Chair", 40, 499.99);
		desk = new Furniture("Desk", 10, 200.10);
	}

	public double getItemRent(int key, int qty, int days) {
		
		double itemRent = 0.0;
		
		switch(key) {
		case 1:
			if(computers.updateQuantity(qty)) {
				itemRent = computers.calculateRent(qty, days);
			}
			break;
		case 2:
			if(furnitures.updateQuantity(qty)) {
				itemRent = furnitures.calculateRent(qty, days);
			}
			break;
		case 3:
			if(desk.updateQuantity(qty)) {
				itemRent = desk.calculateRent(qty, days);
			}
			break;
		default:
			// do nothing
		}
		
		return itemRent;
	}
}
