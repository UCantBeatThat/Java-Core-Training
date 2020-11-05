package com.training.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.training.task.MyTask;

public class ScheduledPoolExample {

	
	public static void main(String[] args) {
		
		
		try {
			ScheduledThreadPoolExecutor executor =
					new ScheduledThreadPoolExecutor(2);
			
			MyTask task = new MyTask("Welcome to Executor");
			
			
			executor.scheduleWithFixedDelay(task, 2, 10, TimeUnit.SECONDS);
			
			executor.awaitTermination(30, TimeUnit.SECONDS);
			
			executor.shutdown();
		} catch (InterruptedException e) {
					e.printStackTrace();
		}

	}
	
	
}
