package com.training.services;

import com.training.model.HousingLoan;

public class UpdateLoanServices extends LoanService {

	@Override
	public HousingLoan getLoan(int key) {
		if(key == 2) {
			return new HousingLoan(900, "Manish", 788, "Individual", "Non-Metro");
		}
		return (HousingLoan) super.getLoan(key);
	}	
}
