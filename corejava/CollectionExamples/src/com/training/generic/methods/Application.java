package com.training.generic.methods;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		
		List<Insurance> insuranceList = 
				   Arrays.asList(new Insurance("Ramesh",60000),new Insurance("Suresh",70000));
		
		
		List<VechileInsurance> vechileList = 
				   Arrays.asList(new VechileInsurance("Gaurav",60000,"Bike"),
						     new VechileInsurance("Vishal",70000,"Car"));
		
		
		Comparator<VechileInsurance> nameComp =
				(obj1,obj2) -> obj1.getPolicyHolderName().compareTo(obj2.getPolicyHolderName());
				
				Collections.sort(vechileList,nameComp);

		            
		// create a Lambda expression for Comparator interface and use it 
		// sort method
		
		Set<LifeInsurance> lifeList = new HashSet<>(); 
				   lifeList.add(new LifeInsurance("Basva",60000,23));
					lifeList.add(new LifeInsurance("Nagaraj",70000,12));
		
		PolicyManager mgr = new PolicyManager();
		
		 mgr.displayPolicy(insuranceList);
		 mgr.displayPolicy(vechileList);
		 mgr.displayPolicy(lifeList);
		 
		 
	}

}
