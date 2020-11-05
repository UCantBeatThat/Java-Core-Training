package com.training;

public class BankApplication {

	public static void main(String[] args) {

		
		SavingsAccount ramsAccount =
				
				 new SavingsAccount(100,"Ramesh",4000);
		
		System.out.println(ramsAccount.deposit(4000));

		
		System.out.println(ramsAccount.withdraw(2000));
		
		System.out.println(ramsAccount.withdraw(1000));
		
	}

}
