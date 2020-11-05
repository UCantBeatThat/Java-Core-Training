package com.training;

import com.training.daos.CardPaymentDaoImpl;
import com.training.entity.CardPayment;
import com.training.ifaces.Dao;
import com.training.utils.DbConnection;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
public class Application {

	public static void main(String[] args) {

		
		
		
		
		
		try(		Connection con= DbConnection.getOracleConnection();
) {
			CardPayment  payment = 
					new CardPayment(30203142, 45423949, "by neft", 
							      26200,LocalDate.of(2019, Month.OCTOBER,14));
			
			
			Dao dao = new CardPaymentDaoImpl(con);
			
//			int rowAdded = dao.add(payment);
//			
//			System.out.println(rowAdded + " :=Row  Added");
//			
			List<CardPayment> pmtList = dao.findAll();
			
			pmtList.forEach(System.out::println);
			
			System.out.println("Find By Id");
			CardPayment pmt = (CardPayment) dao.findById(20303030);
			
		
			CardPayment  payment2 = 
					new CardPayment(20303030, 45423949, "by neft", 
							      26200,LocalDate.of(2018, Month.SEPTEMBER,12));
			dao.update(payment2);
			System.out.println("After Update");
			System.out.println(dao.findById(20303030));
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
