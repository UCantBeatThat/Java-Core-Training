package com.training;

import java.util.*;

import com.training.model.Invoice;
import com.training.utils.InvoiceComparators;

public class SetAndMap {

	public static Set<Invoice> createHashSet(Invoice ...invoices) {
		
		HashSet<Invoice> invoiceSet = new HashSet<Invoice>();
		
		for(Invoice eachInvoice:invoices) {
			invoiceSet.add(eachInvoice);
		}
		
		return invoiceSet;
		
	}
	
	public static Set<Invoice> createTreeSet(Invoice ...invoices) {
		
		InvoiceComparators comparators = new InvoiceComparators();
		
		TreeSet<Invoice> treeSet = new TreeSet<Invoice>(comparators.new InvoiceAmountComparator());
		
		for(Invoice eachInvoice:invoices) {
			treeSet.add(eachInvoice);
		}
		
		return treeSet;
	}
	
	public static Map<String, Invoice> createHashMap(Invoice ...invoices) {
		
		HashMap<String, Invoice> map = new HashMap<String, Invoice>();
		
		for(Invoice eachInvoice:invoices) {
			System.out.println(map.put(eachInvoice.getCustomerName(), eachInvoice));
		}
		
		System.out.println(map.get("Ramesh"));
		
		return map;
	}
	
	public static void print(Collection<Invoice> collection) {
		
		for(Invoice eachInvoice:collection) {
			System.out.println(eachInvoice);
		}
	}
	
	public static void print(Map<String, Invoice> collection) {
		
		Set<Map.Entry<String, Invoice>> set = collection.entrySet();
		
		for(Map.Entry<String, Invoice> eachEntry:set) {
			System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice inv1 = new Invoice(101, "Ramesh", 6712.0);
		Invoice inv2 = new Invoice(102, "Suresh", 3412.0);
		Invoice inv3 = new Invoice(103, "Anup", 4342);
		
		Invoice inv4 = new Invoice(103, "Anup", 4341);
		
		// print(createHashSet(inv1, inv2, inv3, inv4));
		
		//print(createTreeSet(inv1, inv2, inv3, inv4));
		
		print(createHashMap(inv1, inv2, inv3, inv4));
	}

}
