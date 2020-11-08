package com.training.ifaces;

import java.util.List;

public interface DataAccess<T>{
	
	public boolean add(T t);
	
	public List<T> findAll();
	
	public boolean remove(T t);
	
	public boolean update(T t);
	
	public List<T> getSortedListBy(String field);
	
}
