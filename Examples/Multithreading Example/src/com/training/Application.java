package com.training;

import com.training.ifaces.Display;
import com.training.utils.Counter;
import com.training.utils.UseNumberService;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Thread in main: " + Thread.currentThread());
		
		// Creating an instance of Runnable
		Counter count1 = new Counter();
		
		// Creating instance of thread and pass runnable as arguement
		
//		for(int i=0;i<5;i++) {
//			Thread t1 = new Thread(count1, "Thread" + i);
//			t1.start();
//		}
		
		
		try {
			
			new UseNumberService(10, "TenCount");
			
			Thread.sleep(2000);
			
			new UseNumberService(100, "HundredCount");
			new UseNumberService(1000, "ThousandCount");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Display obj = new Display() {
			
			@Override
			public String showMessage() {
				// TODO Auto-generated method stub
				return "Inside Display Anonymous Class";
			}
		};
		
	}

}
