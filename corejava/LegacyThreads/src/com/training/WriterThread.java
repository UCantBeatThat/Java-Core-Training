package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class WriterThread implements Runnable {

	  protected BlockingQueue<String> blockingQueue = null;

	  
	public WriterThread(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

	    try (PrintWriter writer = new PrintWriter(new File("Student.txt"))) {
	        

	        while(true){
	            String buffer = blockingQueue.take();
	            if(buffer.equals("EOF")){ 
	                break;
	            }
	            writer.println(buffer);
	        }               

	    } catch (Exception e) {
			e.printStackTrace();
		}
	}
}


