package com.training.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.training.task.DisplayTask;

public class ExampleForSingleThreadExecutor {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		
	//	 ExecutorService service = Executors.newSingleThreadExecutor();
		
		
		Runnable task1 = new DisplayTask(10);
		
		Runnable task2 = new DisplayTask(5);
		
		 final int count = 10;
				
		Runnable task3 = () -> {
			
			System.out.println(Thread.currentThread().getName());

			int sum = 0;
			for(int i =1;i<count;i++) {
				
				sum+=i;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(sum);

		};

		service.submit(task1);
		
		service.submit(task2);
		
		service.submit(task3);
		
		service.shutdown();
	}
	

}
