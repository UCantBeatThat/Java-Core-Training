package com.project.organicstores.daily_sales_report.services;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import com.project.organicstores.daily_sales_report.model.Product;

public class ReportGeneratorService {
	
	private Connection connection;
	
	public ReportGeneratorService(Connection connection) {
		super();
		this.connection = connection;
	}

	public void generateReportByDate(int key, LocalDate date) {
		
		ProductService productService = new ProductService(connection);
		
		List<Product> productList = productService.findByDate(key, date);
		
		double grandTotal = 0.0;
		int totalQuantity = 0;
		
		if(key == 1) {
			System.out.println("Edible Items report for " + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear());
		}
		else if(key == 2) {
			System.out.println("Garment Items report for " + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear());
		}
		else if(key == 3) {
			System.out.println("Electronic Items report for " + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear());
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Sl. No.\tItem Name\t\tUnit Price\tQuantity\tAmount\t");
		System.out.println("--------------------------------------------------------------------------");
		
		for(Product eachProduct : productList) {
			grandTotal += eachProduct.getLineTotal();
			totalQuantity += eachProduct.getQuantity();
			System.out.println(eachProduct.getItemCode() + "\t" + eachProduct.getItemName() + "\t\t" 
					+ eachProduct.getUnitPrice() + "\t\t" + eachProduct.getQuantity() + "\t\t" + eachProduct.getLineTotal());
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Total\t\t\t\t\t\t" + totalQuantity + "\t\t" + grandTotal);
		System.out.println("--------------------------------------------------------------------------\n\n");
	}
	
	public void generateReportForTopSellingItems(int key, int month) {
		
		ProductService productService = new ProductService(connection);
		
		List<Product> productList = productService.findTopProductsByMonth(key, month);
		
		final String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int totalQuantity = 0;
		
		if(key == 1) {
			System.out.println("Top Selling Edible Items for " + monthNames[month-1] + " 2020");
		}
		else if(key == 2) {
			System.out.println("Top Selling Garment Items for " + monthNames[month-1] + " 2020");
		}
		else if(key == 3) {
			System.out.println("Top Selling Electronic Items for " + monthNames[month-1] + " 2020");
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Sl. No.\tItem Name\t\tQuantity");
		System.out.println("---------------------------------------------------");
		
		for(Product eachProduct : productList) {
			totalQuantity += eachProduct.getQuantity();
			System.out.println(eachProduct.getItemCode() + "\t" + eachProduct.getItemName() + "\t\t" 
					+ eachProduct.getQuantity());
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Total\t\t\t\t" + totalQuantity);
		System.out.println("---------------------------------------------------\n\n");
		
	}
}
