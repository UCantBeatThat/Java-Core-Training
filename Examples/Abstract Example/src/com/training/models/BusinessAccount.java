package com.training.models;

public class BusinessAccount extends BankAccount {

	public BusinessAccount(int accountNumber, String accountHolderName, double balance, String businessType) {
		super(accountNumber, accountHolderName, balance);
		this.businessType = businessType;
	}

	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String businessType;
	
	@Override
	public double deposit(double amount) {
		double balance = this.getBalance() + amount;
		this.setBalance(balance);
		
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		double currentBalance = this.getBalance();
		if(getBalance() - amount > 5000) {
			currentBalance = this.getBalance() - amount;
			this.setBalance(currentBalance);
		}
		else{
			System.out.println("Account should have minimum amount of Rs. 5000");
		}
		
		return currentBalance;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	

}
