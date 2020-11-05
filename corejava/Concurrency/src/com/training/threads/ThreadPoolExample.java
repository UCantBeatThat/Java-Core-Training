package com.training.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.training.task.MyTask;

public class ThreadPoolExample {

	public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        for (int i = 1; i <= 5; i++)
        {
            MyTask task = new MyTask("Welcome Count " + i);
            System.out.println("Created : " + task.getMessage());
 
            executor.execute(task);
        }
        executor.shutdown();
    }

	}


