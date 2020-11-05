package com.training;

import java.util.concurrent.BlockingQueue;

public class ReaderThread implements Runnable {

	  protected BlockingQueue<String> blockingQueue = null;

	  
	public ReaderThread(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
