package com.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.utils.UsePrintService;

public class ApplicationForSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new UsePrintService("Poori", "Sagoo"));
		service.execute(new UsePrintService("Idli", "Sambar"));
		service.execute(new UsePrintService("Pizza", "Coke"));
		service.execute(new UsePrintService("Paratha", "Dahi"));	
		
		service.shutdown();
		
	}

}
