package com.training;

public class SavingsAccount extends BankAccount {

	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(long accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public double withdraw(double amount) {

	    double clearBalance = getBalance()-amount;
	    
	    if(clearBalance>1000) {
	    
	    	return super.withdraw(amount);
	    } else {
	    	
	    	System.out.println(" Cannot withdraw-Less than Minimum Balance");
	    	return getBalance();
	    }
		
	}

}

