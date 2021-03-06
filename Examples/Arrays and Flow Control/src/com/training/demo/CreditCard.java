package com.training.demo;

public class CreditCard {
	
	private int cardNumber;
	private String cardholderName;
	private double creditLimit;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(int cardNumber, String cardholderName, double creditLimit) throws Exception {
		super();
		this.cardNumber = cardNumber;
		this.cardholderName = cardholderName;
		if(creditLimit <= 0) {
			throw new Exception("ERR-69: Credit Limit should be a positive non-zero integer!");
		}
		else {
			this.creditLimit = creditLimit;
		}
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardholderName() {
		return cardholderName;
	}
	
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(double creditLimit) throws Exception{
		if(creditLimit <= 0) {
			throw new Exception("ERR-69: Credit Limit should be a positive non-zero integer!");
		}
		else {
			this.creditLimit = creditLimit;
		}
	}
	
	
}
