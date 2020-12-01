package com.training.demo.model;

import com.training.demo.annotations.DataTable;
import com.training.demo.annotations.Example;

@Example(value = "College Student")
@DataTable(tableName = "student_info")
public class Student {

	private int id;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
