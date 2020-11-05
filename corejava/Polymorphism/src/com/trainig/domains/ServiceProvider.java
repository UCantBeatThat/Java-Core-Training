package com.trainig.domains;

/**
 *  @author Srivatsan
 */
import com.trainig.ifaces.Billable;

public class ServiceProvider {

	
	/**
	 * 
	 * @param poly 
	 *          takes the Billable Object reference and returns the wage 
	 * @return double 
	 *     representation of calculated wage
	 */
	public double findWage(Billable poly) {
		
		
		return poly.calculateWage(); 
		// it will call the calculateWage of either  advocate or cook or singer
	}
	
	
	public Billable  occupationFactory(int key) {
		
		switch (key) {
		case 1:
			return new Advocate(20,"sc");
		case 2:
			 return new  Cook(30,"jain");
		default:
			return null;
		}
	}
}
