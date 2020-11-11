package com.training.demo.calculator;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class Calculator {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public double calculate(String ... values) throws NumberFormatException, ArrayIndexOutOfBoundsException {
		
		double result = 0.0;
				
		int number = Integer.parseInt(values[1]);
		
		log.info("Value Entered is:" + number);
		
		result = number*10.0;	
		
		try {
			log.debug("Making the thread sleep for 2 seconds");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			log.error("Catch block: Interrupted Exception Encountered");
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String getNameFromList(int indexPos) {
		
		List<String> namelist = Arrays.asList("Ramesh", null, "Suresh", null, "Manish", "Sukesh");
		
		return namelist.get(indexPos);
	}
}
