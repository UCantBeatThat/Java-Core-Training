package com.training.utils;

import com.training.services.PrintService;

public class UsePrintService implements Runnable {

	private String str1;
	private String str2;
	
	public UsePrintService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsePrintService(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		//Thread t1 = new Thread(this);
		//t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintService.print(str1, str2);
	}

}
