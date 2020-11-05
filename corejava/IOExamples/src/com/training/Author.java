package com.training;

import java.io.Serializable;

public class Author implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 210L;
	private long id;
	private String authorName;
	private long phoneNumber;
	private String email;
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(long id, String authorName, long phoneNumber, String email) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return  id + "," + authorName + "," + phoneNumber + "," + email;
	}
	
	
}
