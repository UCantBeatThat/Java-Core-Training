package com.training.ifaces;

public interface Item {
	
	public double calculateRent(int qty, int days);
	
	public boolean updateQuantity(int qty);
}