package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class CreateMultithread {

	public static void main(String[] args) {

		
		ExecutorService executor = Executors.newSingleThreadExecutor();

		List<String> list = new ArrayList<>();
		
		NameManager task1 =new NameManager(list,"Ramesh","Suresh","Magesh");
		
		NameManager task2 =new NameManager(list,"Vidya","vani","Rani");

		   executor.submit(task1);
		   
		   executor.submit(task2);
		   
		executor.shutdown();
		

		 task1.getList().forEach(System.out::println);

	}

}
