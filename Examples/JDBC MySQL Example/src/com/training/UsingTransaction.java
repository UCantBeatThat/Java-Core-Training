package com.training;

import java.sql.Connection;

import com.training.model.Invoice;
import com.training.services.CustomerService;
import com.training.utils.ConnectionUtils;

public class UsingTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice inv1 = new Invoice(302, "Ramesh", 672.0);
		
		Connection connection = ConnectionUtils.getConnectionFromPool();
		
		CustomerService customerService = new CustomerService(connection);
		
		System.out.println(customerService.add(inv1));
	}

}
