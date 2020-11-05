package com.training.executors;
import java.util.Arrays;
import java.util.concurrent.*;
public class ScheduledExecutors {

    
	public static void main(String[] args) {

       final ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        System.out.println("Fixed Thread Pool executed in a periood of 10 seconds ");

        Runnable task2 = () ->{   Arrays.asList(45,67,42,899).forEach(System.out::println); };
        
        
       // ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task2, 2, 1, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture = ses.scheduleWithFixedDelay(task2, 2, 1, TimeUnit.SECONDS);


        ses.schedule(() ->{scheduledFuture.cancel(true); ses.shutdown(); }, 5, TimeUnit.SECONDS);

	
	}

	


    

}
