package com.training.domains;

public class Author implements Comparable<Author>{

	@Override
	public int compareTo(Author otherObject) {

		if(otherObject.id < this.id) return 1;
		if(otherObject.id > this.id) return -1;
		return 0;
	}
	private long id;
	private String authorName;
	private long phoneNumber;
	private String email;
	
	public Author() {
		super();
	
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
		return "Author [id=" + id + ", authorName=" + authorName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	
}
