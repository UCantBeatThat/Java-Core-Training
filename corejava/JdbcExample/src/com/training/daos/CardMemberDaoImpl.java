package com.training.daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.training.entity.CardMember;
import com.training.ifaces.Dao;

public class CardMemberDaoImpl implements Dao<CardMember> {

	private Connection con;

	
	public CardMemberDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(CardMember t) throws SQLException {
		
		
		return 0;
	}

	@Override
	public List<CardMember> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardMember findById(long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(CardMember t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(long id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
