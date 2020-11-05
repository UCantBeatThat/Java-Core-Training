package com.trainig.domains;

public abstract class Occupation {

	private double ratePerUnit;
	private double hoursWorked;
	private String category;
	
	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Occupation() {
		super();
	}

	public Occupation(double ratePerUnit, double hoursWorked, String category) {
		super();
		this.ratePerUnit = ratePerUnit;
		this.hoursWorked = hoursWorked;
		this.category = category;
	}

	public Occupation(double hoursWorked, String category) {
		super();
		this.hoursWorked = hoursWorked;
		this.category = category;
	}
	
	
}
