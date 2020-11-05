package com.training.task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable {

	private String message;
	
	
	public MyTask(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public MyTask() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {

		long duration =(long)( Math.random() * 10);
		
		System.err.println(message);
		
		try {
			TimeUnit.MILLISECONDS.sleep(duration);
			 System.out.println("Executing : " + message + ", Current Seconds : " + new Date().getSeconds());
			  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	
	}

}
