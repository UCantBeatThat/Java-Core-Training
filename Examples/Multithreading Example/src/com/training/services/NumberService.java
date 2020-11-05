package com.training.services;

public class NumberService {

	private int countTo;
	
	public NumberService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumberService(int countTo) {
		super();
		this.countTo = countTo;
	}
	
	public void sumNumbers(int upto) {
		int count = 0;
		
		for(int i=0;i<=upto;i++) {
			count=count+i;
		}

		System.out.println("Thread in child:" + Thread.currentThread());
		System.out.println("Count Upto " + upto + " == " + count);
	}
	
}
