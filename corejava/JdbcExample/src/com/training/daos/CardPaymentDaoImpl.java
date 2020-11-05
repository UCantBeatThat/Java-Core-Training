package com.training.daos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import com.training.entity.CardPayment;
import com.training.ifaces.Dao;

public class CardPaymentDaoImpl implements Dao<CardPayment> {

	private Connection con;
	
		public CardPaymentDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(CardPayment t) throws SQLException {

		//String sql = "insert into cardPayment(amountPaid,cardNumber) values(?,?)";

		String sql = "insert into cardPayment values(?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		Date txnDate = Date.valueOf(t.getPaymentDate());

		// Here 1 denotes the ? in the sql  argument  and NOT COLUMN NUMBER IN TABLE
		  
		pstmt.setLong(1, t.getTranactionId());
        pstmt.setLong(2, t.getCardNumber());
		pstmt.setString(3, t.getPaymentDetails());
		pstmt.setDouble(4, t.getAmountPaid());
		pstmt.setDate(5,txnDate);
        
		int rowAdded = pstmt.executeUpdate();
		
			
		return rowAdded;
	}

	@Override
	public List<CardPayment> findAll() throws SQLException {

		String sql = "select * from cardPayment";
		
		List<CardPayment> pmtList = new ArrayList<>();
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		 ResultSet resultSet  = pstmt.executeQuery();
		 
		 while(resultSet.next()) {
			 
			      CardPayment pmt = mapToCardPayment(resultSet);
			      pmtList.add(pmt);
		 }
		
		
		return pmtList;
	}

	private CardPayment mapToCardPayment(ResultSet resultSet) throws  SQLException{
		
		 long transactionId =   resultSet.getLong("tranactionid");
		  long cardNumber = resultSet.getLong("cardNumber");
		String paymentDetails= resultSet.getString("paymentDetails");
		double amountPaid =resultSet.getDouble("amountPaid");
		
		 Date date = resultSet.getDate("paymentDate");
		 LocalDate paymentDate=null;
		 if(date!=null) {
		
			 paymentDate = date.toLocalDate();
				
		 }
		
			      CardPayment pmt = new CardPayment(transactionId, cardNumber, paymentDetails, amountPaid,paymentDate);
		
			      return pmt;
	}
	private String srchByKey="select * from cardPayment where TRANACTIONID=?";

	@Override
	public CardPayment findById(long id) throws SQLException {
		
		CardPayment pmt = null;
		PreparedStatement pstmt = con.prepareStatement(srchByKey);
		
		pstmt.setLong(1,id);
		     ResultSet resultSet = pstmt.executeQuery();
		     
		    if(resultSet.next()) {
		    	 
		    	  pmt =mapToCardPayment(resultSet);
		     }
		
		return pmt;
	}

	@Override
	public int update(CardPayment t) throws SQLException {

		String sql = "update cardPayment set cardNumber=?,"
				+ "paymentDetails=?,amountPaid =?,paymentDate=? "
				+ "where TRANACTIONID=?"; 
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		 pstmt.setLong(1, t.getCardNumber());
		 pstmt.setString(2, t.getPaymentDetails());
		 pstmt.setDouble(3, t.getAmountPaid());
		 
			Date txnDate = Date.valueOf(t.getPaymentDate());

		 pstmt.setDate(4, txnDate);
		pstmt.setLong(5, t.getTranactionId());
		
		int rowUpdated = pstmt.executeUpdate();
		
		return rowUpdated;
	}

	@Override
	public int remove(long id) throws SQLException {
		
		PreparedStatement pstmt = con.prepareStatement(srchByKey);
		 pstmt.setLong(1, id);
		 
		 int rowDeleted = pstmt.executeUpdate();
		
		return rowDeleted;
	}

}
