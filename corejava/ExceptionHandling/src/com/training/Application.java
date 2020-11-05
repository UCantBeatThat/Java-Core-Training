package com.training;

public class Application {

	public static void main(String[] args)  {

		
		BankAccount ramsAccount = new BankAccount(1020,"Ramesh", 14500);
		
		
		BankAccount shyamsAccount = new BankAccount();
		
		  try {
			shyamsAccount.setAccountNumber(2020);
			  shyamsAccount.setAccountHolderName("Shyam Kumar");
			  shyamsAccount.setBalance(490000);

		  } catch (Exception e) {
			
			//System.err.println(e.getMessage());
			e.printStackTrace(System.err);
		}
		  
		  
	}

}
