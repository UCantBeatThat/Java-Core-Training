package com.training.utils;

import java.util.Comparator;

import com.training.model.Invoice;

public class InvoiceComparators {
	
	public class InvoiceNumberComparator implements Comparator<Invoice>{

		@Override
		public int compare(Invoice o1, Invoice o2) {
			// TODO Auto-generated method stub
			if(o1.getInvoiceNumber() < o2.getInvoiceNumber())
				return -1;
			if(o1.getInvoiceNumber() > o2.getInvoiceNumber())
				return 1;
			return 0;
		}
		
	}
	
	public class InvoiceAmountComparator implements Comparator<Invoice>{

		@Override
		public int compare(Invoice o1, Invoice o2) {
			// TODO Auto-generated method stub
			if(o1.getAmount() < o2.getAmount())
				return -1;
			if(o1.getAmount() > o2.getAmount())
				return 1;
			return 0;
		}
		
		
	}
}
