package com.training.executors;

import java.util.concurrent.Executor;

public class ShowMessage implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<=10;i++) {
			System.out.println("Inside Thread");
		}
	}

	public static void main(String[] args) {
		
		 Executor  obj = new MyExecutor();
		 
		   obj.execute(new ShowMessage());
	}
}
