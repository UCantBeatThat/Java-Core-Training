package com.training;

import com.training.ifaces.Converter;
import com.training.models.*;
import com.training.services.*;

public class ConverterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter tempConv = new TemperatureConverter(-40.0);
		
		Converter currConv = new CurrencyConverter(89);
		
		ConverterService service = new ConverterService();
		
		service.print(tempConv);
		
		service.print(currConv);
		
		int key = 2;
		
		Converter convRef = service.getReference(key);
		
		if(convRef instanceof TemperatureConverter) {
			TemperatureConverter conv = (TemperatureConverter)convRef;
			conv.setCelcius(-40);
		}
		else if(convRef instanceof CurrencyConverter) {
			CurrencyConverter conv = (CurrencyConverter)convRef;
			conv.setIndianRupees(200);
		}
		
		service.print(convRef);
	}

}
