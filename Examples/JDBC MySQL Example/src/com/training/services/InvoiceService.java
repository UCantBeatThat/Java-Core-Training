package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.training.ifaces.DataAccess;
import com.training.model.Invoice;

public class InvoiceService implements DataAccess<Invoice> {

	private Connection connection;
	
	public InvoiceService(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public boolean add(Invoice t) {
		
		String insertQuery = "INSERT INTO invoice VALUES(?,?,?)";
		
		int rowsAdded = 0;
		
		try(PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
			
			pstmt.setInt(1, t.getInvoiceNumber());
			pstmt.setString(2, t.getCustomerName());
			pstmt.setDouble(3, t.getAmount());
			
			rowsAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowsAdded == 1?true:false;
		
	}

	@Override
	public List<Invoice> findAll() {
		
		String selectQuery = "SELECT * FROM invoice";
		
		ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
		
		try(PreparedStatement pstmt = connection.prepareStatement(selectQuery)){
			
			ResultSet resultList = pstmt.executeQuery(selectQuery);
			
			while(resultList.next()) {
				int invNumber = resultList.getInt(1);
				String custName = resultList.getString(2);
				double amount = resultList.getDouble(3);
				
				Invoice inv = new Invoice(invNumber, custName, amount);
				
				invoiceList.add(inv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return invoiceList;
	}

	@Override
	public boolean remove(Invoice t) {
		
		String deleteQuery = "DELETE FROM invoice WHERE invoiceNumber = ?";
		
		int rowsDeleted = 0;
		
		try(PreparedStatement pstmt = connection.prepareStatement(deleteQuery)) {
			
			pstmt.setInt(1, t.getInvoiceNumber());
			
			rowsDeleted = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowsDeleted == 1?true:false;
	}

	@Override
	public List<Invoice> getSortedListBy(String field) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Invoice t) {
		
		String updateQuery = "UPDATE invoices SET WHERE invoiceNumber = ?";
		
		int rowsDeleted = 0;
		
		try(PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
			
			pstmt.setInt(1, t.getInvoiceNumber());
			
			rowsDeleted = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowsDeleted == 1?true:false;
	}

}
