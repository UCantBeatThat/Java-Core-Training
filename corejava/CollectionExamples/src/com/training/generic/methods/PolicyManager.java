package com.training.generic.methods;
import java.util.*;
public class PolicyManager {

	
//	public void displayPolicy(List<Insurance > policyList) {
//		
//		for(Insurance eachPolicy: policyList) {
//			System.out.println(eachPolicy.calculatePremium());
//		}
//	}
//	
	// instead of Creating three different method for each Policy we create a generic method
	
public void displayPolicy(Collection<? extends Insurance> policyList) {
	
	// We can only  get and not ADD from the collection since its "extends"
	
	  // System.out.println(policyList.add(new Insurance("Gupta",56000)));
	
		for(Insurance eachPolicy: policyList) {
			System.out.println(eachPolicy);
			System.out.println(eachPolicy.calculatePremium());
		}
	}


public void printPolicy(Collection<? super LifeInsurance> policyList) {
	
	// We are able to add and get from the collection since its "super"
	
	  System.out.println(policyList.add(new LifeInsurance("Gupta",56000,12)));
	
	  for(Object eachInsurance :policyList) {
		  
		  LifeInsurance insurance = (LifeInsurance)eachInsurance;
		  
		  System.out.println(insurance.calculatePremium());
	  }
	  
	}

}
