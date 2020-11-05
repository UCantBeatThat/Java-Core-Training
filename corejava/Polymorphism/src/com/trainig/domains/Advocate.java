package com.trainig.domains;

import com.trainig.ifaces.Billable;

public class Advocate extends Occupation  implements Billable{

	
	
	public Advocate() {
		super();
	}

	public Advocate(double ratePerUnit, double hoursWorked, String category) {
		super(ratePerUnit, hoursWorked, category);
	}

	public Advocate(double hoursWorked, String category) {
		super(hoursWorked, category);
	}

	@Override
	public double calculateWage() {

		if(getCategory().equalsIgnoreCase("hc")) {
				  setRatePerUnit(1000);
		} else if(getCategory().equalsIgnoreCase("sc")) {
			setRatePerUnit(5000);
		} else {
			
			setRatePerUnit(500.00);
		}
		
	
		
		return getHoursWorked() * getRatePerUnit();
	}

}
