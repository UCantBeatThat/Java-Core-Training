package com.converter;

public class CurrencyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter convObj = new CurrencyConverter();
		
		System.out.println("Input (RS): " + args[0]);
		System.out.println("Output (USD): " + convObj.dollarToRupees(Double.parseDouble(args[0])));
	}

}