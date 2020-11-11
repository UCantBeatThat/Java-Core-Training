package com.training;

import java.util.Arrays;
import java.util.List;

public class Calculator {

	public double calculate(String ... values) throws NumberFormatException, ArrayIndexOutOfBoundsException {
		
		double result = 0.0;
				
		int number = Integer.parseInt(values[1]);
		result = number*10.0;	
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String getNameFromList(int indexPos) {
		
		List<String> namelist = Arrays.asList("Ramesh", null, "Suresh", null, "Manish", "Sukesh");
		
		return namelist.get(indexPos);
	}
}
