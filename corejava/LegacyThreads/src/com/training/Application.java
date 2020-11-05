package com.training;

public class Application {

	public static void main(String[] args) {

		
		Thread t1 = new Thread(new UsePrintString("1-Tea","Biscuit"));
		
		Thread t2 = new Thread(new UsePrintString("2-Idly","Sambar"));
		
		Thread t3 = new Thread(new UsePrintString("3-pizza","coke"));
		
		Thread t4 = new Thread(new UsePrintString("4-Parantha","dahi"));
		
		
		try {
			
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
			
			t3.start();
			t3.join();
			
			t4.start();
		} catch (InterruptedException e) {
			
		}
		
	}

}
