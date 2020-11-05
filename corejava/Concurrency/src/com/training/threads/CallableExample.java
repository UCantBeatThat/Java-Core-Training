package com.training.threads;

import java.util.concurrent.Future;
import java.util.List;
import java.util.*;
import java.util.concurrent.*;

public class CallableExample {

	public static void main(String[] args) {
		
        ExecutorService executor =  Executors.newFixedThreadPool(2);
        
           
            FactorialCalculator calculator  = new FactorialCalculator(5);
            
         
              try
              {
                  Future<Integer> task = executor.submit(calculator);

                  System.out.println("Future result is - " + " - " + task.get() + "; And Task done is " + task.isDone());
              } 
              catch ( ExecutionException | InterruptedException e) 
              {
                  e.printStackTrace();
              }
          
          executor.shutdown();
    }

	}


