package com.training.services;

import com.training.models.BankAccount;
import com.training.models.BusinessAccount;
import com.training.models.SavingsAccount;

public class BankAccountService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new SavingsAccount(1000, "Ramesh", 2000, "Suresh");
		
		account.deposit(1000);
		System.out.println("Current Balance: " + account.getBalance() + "\n");
		
		account.withdraw(5000);		
		System.out.println("Current Balance: " + account.getBalance() + "\n");
		
		BankAccount account2 = new BusinessAccount(1001, "Suresh", 6000, "Ramesh");
		
		account2.deposit(1000);
		System.out.println("Current Balance: " + account2.getBalance() + "\n");
		
		account2.withdraw(3000);
		System.out.println("Current Balance: " + account2.getBalance() + "\n");
		
		account2.withdraw(1000);
		System.out.println("Current Balance: " + account2.getBalance() + "\n");
	}

}
