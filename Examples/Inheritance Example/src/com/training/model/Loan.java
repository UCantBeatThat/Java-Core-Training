package com.training.model;

public class Loan extends Object {
	
	private int loanID;
	private String applicantName;
	private int cibilScore;
	
	public Loan() {
		super();
	}
	
	public Loan(int loanID, String applicantName, int cibilScore) {
		super();
		this.loanID = loanID;
		this.applicantName = applicantName;
		this.cibilScore = cibilScore;
	}

	public int getLoanID() {
		return loanID;
	}

	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	@Override
	public String toString() {
		// return super.toString() + " Subclass print statements here";
		return  "\nApplicant Details\n------------------\nLoan ID: " + this.loanID
				+ "\nApplicant Name: " + this.applicantName 
				+ "\nCibil Score: " + this.cibilScore;
	}
	
	public double findRateOfInterest() {
		
		double interestRate = 7.5;
		
		if(this.cibilScore < 600) {
			interestRate = 9.0;
		}
		else if(this.cibilScore >= 600 && cibilScore <= 750) {
			interestRate = 8.0;
		}
		
		return interestRate;
	}
	
}
