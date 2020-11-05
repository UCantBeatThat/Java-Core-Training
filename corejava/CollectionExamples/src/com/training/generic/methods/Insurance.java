package com.training.generic.methods;

public class Insurance {

	private String policyHolderName;
	private double policyAmount;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(String policyHolderName, double policyAmount) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public double calculatePremium() {
		
		 return 1000.00;
	}
	@Override
	public String toString() {
		return "Insurance [policyHolderName=" + policyHolderName + ", policyAmount=" + policyAmount + "]";
	}
	
}
