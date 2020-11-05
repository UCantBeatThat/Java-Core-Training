package com.training.list.demo;
import java.util.*;
public class GenericManager<T> {

	private List<T>  dataList;

	public GenericManager() {
		super();
	    dataList = new ArrayList<>();	
	}
	
	public boolean add(T element) {
		
		return this.dataList.add(element);
	}

	public List<T> getDataList() {
		return dataList;
	}

	
	
	
}
