package com.training.model;

public class HousingLoan extends Loan {
	
	private String housingType;
	private String location;
	
	public HousingLoan() {
		super();
	}
	
	public HousingLoan(int loanID, String applicantName, int cibilScore, String housingType, String location) {
		super(loanID, applicantName, cibilScore);
		this.housingType = housingType;
		this.location = location;
	}

	public String getHousingType() {
		return housingType;
	}

	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return super.toString() + "\nHousing Type: " + this.housingType + "\nLocation: " + this.location;
	}

	@Override
	public double findRateOfInterest() {
		double interestRate = 9.0;
		
		if(this.location.equals("Metro") && this.housingType.equals("Apartment")) {
			if(this.getCibilScore() < 650) {
				interestRate = 7.5;
			}
			else {
				interestRate = 6.2;
			}
		}
		else if(this.location.equals("Non-Metro") && this.housingType.equals("Individual")) {
			if(this.getCibilScore() < 650) {
				interestRate = 8.5;
			}
			else {
				interestRate = 7.4;
			}
		}
		
		return interestRate;
	}
}
