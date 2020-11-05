package com.training.models;

import com.training.ifaces.Converter;

public class CurrencyConverter implements Converter {
	
	private double indianRupees;

	public CurrencyConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrencyConverter(double indianRupees) {
		super();
		this.indianRupees = indianRupees;
	}
	
	public double getIndianRupees() {
		return indianRupees;
	}

	public void setIndianRupees(double indianRupees) {
		this.indianRupees = indianRupees;
	}

	@Override
	public double convert() {
		// TODO Auto-generated method stub
		return this.indianRupees/74.00;
	}

}
