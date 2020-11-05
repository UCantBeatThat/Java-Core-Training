package com.training.entity;

import java.time.LocalDate;
import java.util.List;

public class CardMember {

	private String memberName;
	private LocalDate dateOfBirth;
	private Address address;
	private long phoneNumber;
	private long cardNumber;
	
	private CardPayment payment;

	public CardMember(String memberName, LocalDate dateOfBirth, Address address, long phoneNumber, long cardNumber) {
		super();
		this.memberName = memberName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.cardNumber = cardNumber;
	}

	public CardMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardMember(String memberName, LocalDate dateOfBirth, Address address, long phoneNumber, long cardNumber,
			CardPayment payment) {
		super();
		this.memberName = memberName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.cardNumber = cardNumber;
		this.payment = payment;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CardPayment getPayment() {
		return payment;
	}

	public void setPayment(CardPayment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "CardMember [memberName=" + memberName + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", cardNumber=" + cardNumber + ", payment=" + payment + "]";
	}
	
	
	
}
