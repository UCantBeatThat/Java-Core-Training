package com.training.models;

public class BankAccount {
	
	private double balance;

	public BankAccount() {
		super();
		this.balance = 3000.0;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized double deposit(double amount) {
		
		this.balance += amount;
		notifyAll();
		return (this.balance);
	}
	
	public synchronized double withdraw(double amount) {
		
		while(this.balance < amount) {
			System.out.println("Insufficient Balance");
			
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return (this.balance -= amount);
	}

}
