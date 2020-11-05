package com.training;


public class MyCounter implements Runnable {

	private long count;
	
	public MyCounter(long count) {
		this.count = count;
		
	}


	@Override
	public void run() {

		long sum =0;
	
	
		 try {
			Thread.sleep(200);

			 
			 for(int i=0;i<=count;i++) {
				 sum+=i;
			 }

		 } catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		 System.out.println(Thread.currentThread().getName() +"=" +sum);
	}



	
}
