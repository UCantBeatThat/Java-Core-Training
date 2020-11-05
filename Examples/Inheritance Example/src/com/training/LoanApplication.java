package com.training;

import com.training.model.*;
import com.training.services.LoanService;
import com.training.services.UpdateLoanServices;

public class LoanApplication {

	public static void main(String[] args) {
		
//		Loan loan = new Loan(102, "Suresh", 820);
//		
//		System.out.println(loan);
//		
//		System.out.println("\nCalculated ROI: " + loan.findRateOfInterest() + "%");
//		
//		// Housing Loan 
//		
//		System.out.println("\n------------------ Housing Loan ------------------");
//		
//		HousingLoan houseLoan = new HousingLoan(201, "Ramesh", 610, "Individual", "Non-Metro");
//		
//		System.out.println(houseLoan);
//		
//		System.out.println("\nCalculated ROI: " + houseLoan.findRateOfInterest() + "%");
		
		LoanService service = new LoanService();
		
		System.out.println(service.getLoan(1));
		
		LoanService service1 = new UpdateLoanServices();
		
		System.out.println(service1.getLoan(2));

	}

}
