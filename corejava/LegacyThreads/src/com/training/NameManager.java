package com.training;

import java.util.Arrays;
import java.util.List;

public class NameManager implements Runnable {
	
	private List<String> list;
	
	private List<String> nameToAdd ;
	
	public NameManager(List<String> list,String ... names) {
		super();
		this.list = list;
		this.nameToAdd = Arrays.asList(names);

	}

	public List<String> getList() {
		return list;
	}

	@Override
	public void run() {
		this.list.addAll(nameToAdd);
	}

	
}
