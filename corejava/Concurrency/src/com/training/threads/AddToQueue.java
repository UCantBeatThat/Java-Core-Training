package com.training.threads;

import java.util.concurrent.BlockingQueue;

public class AddToQueue implements Runnable {

    protected BlockingQueue<String> queue = null;

    
	public AddToQueue(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {

        try {
            queue.put("One");
			Thread.sleep(1000);
			queue.put("Two");
			Thread.sleep(1000);
			queue.put("Three");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
