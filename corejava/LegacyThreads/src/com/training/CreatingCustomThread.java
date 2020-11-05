package com.training;

public class CreatingCustomThread {

	public static void main(String[] args) {

	 
		 Runnable countUpto5 = new MyCounter(5);

		 Runnable countUpto10 = new MyCounter(10);
		
	   Thread fiveCounter =new  Thread(countUpto5,"Sum From 1 to 5 ...");
	   
			
	   Thread tenCounter =new  Thread(countUpto10,"Sum From 1 to 10 ...");


	    fiveCounter.start();
	    
	    
	    tenCounter.start();
		 
	    fiveCounter.interrupt();

	}

}
