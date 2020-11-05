package com.training.services;

import com.training.model.Loan;

public class LoanService {
	
	public String docsRequired() { 
		return "PanCard, DL, Salaryslip";
	}
	
	public Loan getLoan(int key) {
		if(key == 1) {
			return new Loan();
		}
		else {
			return null;
		}
	}
}
