package com.training.locks;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ScheduleTraining {

	   private final Lock mylock = new ReentrantLock();

	   public void printJob(Trainer trainer)
	   {
		   mylock.lock();
	      try
	      {
	         Long duration = (long) (Math.random() * 10000);
	         System.out.println(" Session Duration:= "+ duration );
	         Thread.sleep(duration);
	      } catch (InterruptedException e)
	      {
	         e.printStackTrace();
	      } finally
	      {
	         System.out.println( trainer.getTopic() +" Completed");
	         mylock.unlock();
	      }
	   }
}

//https://winterbe.com/posts/2015/05/22/java8-concurrency-tutorial-atomic-concurrent-map-examples/
	
	