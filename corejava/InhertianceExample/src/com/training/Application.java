package com.training;

public class Application {

	public static void main(String[] args) {

		BankAccount ramsAccount = 
				
				new BankAccount(40404, "Ramesh", 4500);

		// For Objects reference is passed and for primitive actual value is passed
		
		//BankAccount ramsAccount2 = ramsAccount;
		
  BankAccount ramsAccount2 = 
				
				new BankAccount(40404, "Ramesh", 4500);
		
		
		System.out.println(ramsAccount.toString());
		
		System.out.println(ramsAccount.equals(ramsAccount2));
		
		
	}

}
