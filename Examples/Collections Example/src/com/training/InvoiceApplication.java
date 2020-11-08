package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.ifaces.Constants;
import com.training.model.Invoice;
import com.training.services.InvoiceService;

public class InvoiceApplication {
	
	public static void print(List<Invoice> invlist) {
		Iterator<Invoice> itr = invlist.iterator();
		
		while(itr.hasNext()) {
			Invoice inv = itr.next();
			System.out.println(inv);
		}
	}

	public static void main(String[] args) {
		
		Invoice inv1 = new Invoice(101, "Ramesh", 6712.0);
		Invoice inv2 = new Invoice(102, "Suresh", 3412.0);
		Invoice inv3 = new Invoice(103, "Anup", 4341);
		
		Invoice inv4 = new Invoice(103, "Anup", 4341);
		
		System.out.println(inv3.equals(inv4));
		
		InvoiceService service = new InvoiceService();
		
		service.add(inv1);
		service.add(inv2);
		service.add(inv3);
		
		List<Invoice> list = service.findAll();
		
		print(list);
		
		List<String> names = Arrays.asList("Ramesh", "Sandesh", "Rajesh", "Suresh", "Shiv", "Yash");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		list.sort(service);
		
		System.out.println(list);
		
		System.out.println("Sorted By Name");
		List<Invoice> list2 = service.getSortedListBy(Constants.CUSTOMERNAME);
		print(list2);
		
		System.out.println("Sorted By Amount");
		List<Invoice> list3 = service.getSortedListBy(Constants.AMOUNT);
		print(list3);
		
		System.out.println("Sorted By Invoice Numer");
		List<Invoice> list4 = service.getSortedListBy(Constants.INVOICENUMBER);
		print(list4);

	}

}
