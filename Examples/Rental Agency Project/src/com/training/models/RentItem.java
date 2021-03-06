package com.training.models;

import com.training.ifaces.Item;

public abstract class RentItem implements Item {
	
	private String itemName;
	private int quantity;
	private double rate;
	
	public RentItem() {
		super();
	}
	
	public RentItem(String item_name, int quantity, double rate) {
		super();
		this.itemName = item_name;
		this.quantity = quantity;
		this.rate = rate;
	}

	public String getItem_name() {
		return itemName;
	}

	public void setItem_name(String item_name) {
		this.itemName = item_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public double calculateRent(int qty, int days) {
		return this.getRate()*qty*days;
	}

	@Override
	public boolean updateQuantity(int qty) {
		System.out.println("Item: " + this.getItem_name() + "\n-------------\nRate per Unit: " + this.getRate() + "\nAvailable Quantity: " + this.getQuantity());
		if(this.getQuantity() - qty >= 0) {
			setQuantity(this.getQuantity() - qty);
			System.out.println("Ordered Quantity: " + qty + "\nRemaining Quantity: " + this.getQuantity());
			return true;
		}
		else {
			System.err.println("Exception: Quantity Exceeded!! Ordered Quantity: " + qty + "\nRemaining Quantity: " + this.getQuantity());
			return false;
		}
	}
}
