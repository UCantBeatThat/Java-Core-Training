package com.trainig.domains;

import com.trainig.ifaces.Billable;

public class Cook extends Occupation  implements Billable {

	
	public Cook() {
		super();
	}

	public Cook(double ratePerUnit, double hoursWorked, String category) {
		super(ratePerUnit, hoursWorked, category);
	}

	public Cook(double hoursWorked, String category) {
		super(hoursWorked, category);
	}

	@Override
	public double calculateWage() {

		if(getCategory().equalsIgnoreCase("veg")) {
			
			setRatePerUnit(500);
		} else {
			setRatePerUnit(1000);
		}
		
		return getHoursWorked() * getRatePerUnit();
	}

}
