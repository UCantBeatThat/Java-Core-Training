package com.training.generic.methods;

public class LifeInsurance extends Insurance {

	 private int age;

	public LifeInsurance(String policyHolderName, double policyAmount, int age) {
		super(policyHolderName, policyAmount);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		double premium = 4000.00;
		if(age <= 18) {
			
			premium = 2000.00;
		}
		
		return premium;
	}
	 

	 
}
