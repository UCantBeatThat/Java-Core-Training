package com.training.model;

public class Student {

	private int id;
	private String name;
	private double markScored;
	private long mobileNumber;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double markScored, long mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.markScored = markScored;
		this.mobileNumber = mobileNumber;
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

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", markScored=" + markScored + ", mobileNumber=" + mobileNumber
				+ "]";
	}
}
