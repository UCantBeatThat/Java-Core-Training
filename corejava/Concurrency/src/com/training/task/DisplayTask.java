package com.training.task;

public class DisplayTask implements Runnable {

	private long count;
	
	
	public DisplayTask(long count) {
		super();
		this.count = count;
	}


	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		double sum = 0;
		for(int i =1;i<count;i++) {
			
			sum+=i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println(sum);
	}

}
