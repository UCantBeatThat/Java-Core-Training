package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.model.Invoice;
import com.training.services.InvoiceService;

public class InvoiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice inv1 = new Invoice(101, "Ramesh", 6712.0);
		Invoice inv2 = new Invoice(102, "Suresh", 3412.0);
		Invoice inv3 = new Invoice(103, "Anup", 4341);
		
		InvoiceService service = new InvoiceService();
		
		service.add(inv1);
		service.add(inv2);
		service.add(inv3);
		
		List<Invoice> list = service.findAll();
		
		Iterator<Invoice> itr = list.iterator();
		
		while(itr.hasNext()) {
			Invoice inv = itr.next();
			System.out.println(inv);
		}
		
		List<String> names = Arrays.asList("Ramesh", "Sandesh", "Rajesh", "Suresh", "Shiv", "Yash");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		list.sort(service);
		
		System.out.println(list);

	}

}