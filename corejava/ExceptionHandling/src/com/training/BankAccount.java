package com.training;

//Properties  and Actions
	// or
	// State and Behavior
	// What he has and what he does
	
public class BankAccount {

	// Instance Variable has a default value, its 0 for Long null for string and false for boolean
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	private final String  MESSAGE = "Account Number should be positive Number";
	private final String  RANGE_ERR_MESSAGE= "Balance Amount should be 1000 to 50000";
	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		super();
		
		try {
		
			if(accountNumber<=0) {
				
				throw new Exception(MESSAGE);
			}
			
			if(balance<1000 || balance >50000) {
				throw new RangeCheckException(RANGE_ERR_MESSAGE);
			}
		}catch(RangeCheckException e) {
			e.printStackTrace();
		}
			catch (Exception e) {
			e.printStackTrace();
		}
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) throws Exception  {
		if(accountNumber<=0) {
			throw new Exception(MESSAGE);
		}
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

	public void setBalance(double balance) throws RangeCheckException{
		
		if(balance <1000 || balance>50000) {
			
			throw new RangeCheckException(RANGE_ERR_MESSAGE);
		}
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		
		return this.balance +=amount; 
	}
	
	public double withdraw(double amount) {
	
		return this.balance-=amount;
	}
	
	
	
}
