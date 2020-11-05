package com.training;

public class BankApplication {

	public static void main(String[] args) {

		// Using Zero Argument Construtor
		BankAccount ramsAccount = new BankAccount();
		
		ramsAccount.setAccountNumber(1010);
		
		ramsAccount.setAccountHolderName("Ram kumar");
		
		 ramsAccount.setBalance(1000);
		
		ramsAccount.deposit(5000);
		
		ramsAccount.withdraw(2000);

		System.out.println(ramsAccount.getBalance());
		
		// Using Parameterized Constructor
		BankAccount shyamsAccount = new BankAccount(2020,"Shyam Kumar", 5000);
		
		System.out.println(shyamsAccount.getBalance());
	}

}
