package com.training.generic.methods;

public class VechileInsurance extends Insurance {

	private String vechileModel;

	public VechileInsurance(String policyHolderName, double policyAmount, String vechileModel) {
		super(policyHolderName, policyAmount);
		this.vechileModel = vechileModel;
	}

	public String getVechileModel() {
		return vechileModel;
	}

	public void setVechileModel(String vechileModel) {
		this.vechileModel = vechileModel;
	}

	@Override
	public double calculatePremium() {

		double premium = 3000.00;
		
		if(vechileModel.equalsIgnoreCase("Bike")) {
			
			premium = 800;
		}
	
		 return premium;
	}

	@Override
	public String toString() {
		return "VechileInsurance [vechileModel=" + vechileModel + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
