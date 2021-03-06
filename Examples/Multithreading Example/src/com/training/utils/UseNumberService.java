package com.training.utils;

import com.training.services.NumberService;

public class UseNumberService implements Runnable {

	private int countTo;
	private String threadName;
	private NumberService service;
	
	
	public UseNumberService(int count, String threadName) {
		super();
		this.countTo = count;
		this.threadName = threadName;
		
		service = new NumberService();
		
		Thread t1 = new Thread(this, threadName);
		
		System.out.println(this.getClass());
		
		t1.start();
	}


	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		service.sumNumbers(this.countTo);
	}

}
