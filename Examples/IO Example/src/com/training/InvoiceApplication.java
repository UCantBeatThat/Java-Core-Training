package com.training;

import java.io.File;

import com.training.model.Invoice;
import com.training.services.InvoiceService;

public class InvoiceApplication {

	public static void main(String[] args) {
		
//		File file = new File("invoice.ser");
//		
//		InvoiceService service = new InvoiceService(file);
//		
//		Invoice ram = new Invoice(101,"Ramesh", 4500);
//		
//		boolean result = service.writeToFile(ram);
//		
//		if(result) {
//			System.out.println("One object stored");
//		}
//		
//		Invoice printObj = service.readFromFile();
//		System.out.println(printObj);
		
		File txtFile = new File("invoice.txt");
		
		InvoiceService txtService = new InvoiceService(txtFile);
		
		
//		Invoice[] invList = {
//				new Invoice(101, "Ramesh", 4500.00),
//				new Invoice(102, "Suresh", 20000.00),
//				new Invoice(103, "Rakesh", 40000.00),
//				new Invoice(104, "Rajesh", 100000.00),
//				new Invoice(105, "Ravesh", 90000.00),
//				new Invoice(105, "Sandesh", 10000.00),
//				new Invoice(101, "Ramesh", 10000.00)
//		};
//		
//		for(Invoice eachInvoice:invList) {
//			boolean result = txtService.writeToTextFile(eachInvoice);
//			
//			System.out.println(result);
//		}
		
		Invoice[] invoiceList = txtService.readFromTextFile();
		
		for(Invoice invoiceItem:invoiceList) {
			if(invoiceItem != null) {
				System.out.println(invoiceItem); 
			}
		}
	}

}
