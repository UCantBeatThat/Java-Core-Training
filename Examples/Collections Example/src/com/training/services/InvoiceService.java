package com.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.Constants;
import com.training.ifaces.DataAccess;
import com.training.model.Invoice;
import com.training.utils.InvoiceComparators;

public class InvoiceService implements DataAccess<Invoice>, Comparator<Invoice> {

	private List<Invoice> invoiceList;
	
	public InvoiceService() {
		super();
		// TODO Auto-generated constructor stub
		this.invoiceList = new ArrayList<>();
	}

	public InvoiceService(List<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}

	@Override
	public boolean add(Invoice t) {
		// TODO Auto-generated method stub
		return this.invoiceList.add(t);
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return this.invoiceList;
	}

	@Override
	public boolean remove(Invoice t) {
		// TODO Auto-generated method stub
		return this.invoiceList.remove(t);
	}

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

	@Override
	public List<Invoice> getSortedListBy(String field) {
		// TODO Auto-generated method stub
		
		InvoiceComparators comparators = new InvoiceComparators();
		switch(field) {
			case Constants.CUSTOMERNAME:
				// Collections.sort(this.invoiceList);
				break;
			case Constants.AMOUNT:
				Collections.sort(this.invoiceList, comparators.new InvoiceAmountComparator());
				break;
			case Constants.INVOICENUMBER:
				Collections.sort(this.invoiceList, comparators.new InvoiceNumberComparator());
		}
		return this.invoiceList;
	}
	
	
}
