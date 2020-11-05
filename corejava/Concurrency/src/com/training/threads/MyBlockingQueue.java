package com.training.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		
		
		
        AddToQueue addToQueue = new AddToQueue(queue);
        ReadFromQueue readFromQueue = new ReadFromQueue(queue);

        new Thread(addToQueue).start();
        new Thread(readFromQueue).start();

        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}

}
