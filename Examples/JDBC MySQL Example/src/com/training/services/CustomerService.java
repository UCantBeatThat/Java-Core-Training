package com.training.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.mysql.cj.jdbc.exceptions.SQLError;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import com.training.model.Invoice;

public class CustomerService {
	
	Connection connection;

	public CustomerService(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public boolean add(Invoice inv) {
		
		boolean result = false;
		
		PreparedStatement invStatement;
		PreparedStatement custStatement;
		
		Savepoint savePoint1 = null;
		Savepoint savePoint2 = null;
		
		try {
			
			String addInvQuery = "INSERT INTO invoice VALUES (?,?,?)";
			String addCustQuery = "INSERT INTO customer values (?,?)";
			
			connection.setAutoCommit(false);
			
			invStatement = connection.prepareStatement(addInvQuery);
			
			invStatement.setInt(1, inv.getInvoiceNumber());
			invStatement.setString(2, inv.getCustomerName());
			invStatement.setDouble(3, inv.getAmount());
			
			
			custStatement = connection.prepareStatement(addCustQuery);
			
			custStatement.setString(1, inv.getCustomerName());
			custStatement.setDouble(2, inv.getAmount()*0.9);
			
			// savePoint1 = connection.setSavepoint("savePoint1");
			
			int result2 = custStatement.executeUpdate();
			int result1 = invStatement.executeUpdate();
			
			// savePoint2 = connection.setSavepoint("savePoint2");
			
			connection.commit();
			
			if(result1 == 1 && result2 == 1) {
				result = true;
			}
		}
		catch(SQLException e) {
//			try {
//				// connection.rollback(savePoint1);
//			}
//			catch(SQLException ee) {
//				ee.printStackTrace();
//			}
			e.printStackTrace();
		}
		
		return result;
	}
	

}
