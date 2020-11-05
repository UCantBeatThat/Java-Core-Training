package com.trainig.ifaces;

/**
 * 
 * @author Srivatsan
 * @version 1.0.0
 *
 */
public interface Billable {

	/**
	 *  The Method calculates the wage based on hours worked and rate per hour
	 * @return wage as a double value
	 */
	public double calculateWage();
}
