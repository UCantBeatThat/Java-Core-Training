package com.training.models;

public abstract class BankAccount {
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	
	public String getMessage() {
		return "Welcome to Abstract Classes";
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
