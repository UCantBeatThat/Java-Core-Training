package com.training.threads;
import java.util.concurrent.*;
public class FutureCancelExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor(); 
		
		long startTime = System.nanoTime(); 
		Future<String> future = executorService.submit(() -> { 
			Thread.sleep(2000); return "Hello from Callable"; });
		
		while(!future.isDone()) { 
		System.out.println("Task is still not done..."); 
		try {
			Thread.sleep(200);
			double elapsedTimeInSec = (System.nanoTime() - startTime)/1000000000.0; 
			if(elapsedTimeInSec > 1) { 
				future.cancel(true); 
				} 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		System.out.println("Task completed! Retrieving the result"); 
			String result;
			try {
				result = future.get();
				System.out.println(result); 

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			} 
			executorService.shutdown(); 

		} 
	}
}
