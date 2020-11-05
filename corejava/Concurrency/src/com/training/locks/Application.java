package com.training.locks;

public class Application {

	public static void main(String[] args) {
		
		ScheduleTraining schedule = new ScheduleTraining();
	
		Thread thread[] = new Thread[3];
	    
		thread[0] = new Thread(new Teaching(schedule,new Trainer("Ramesh", 494949,"Java")));
		thread[1] = new Thread(new Teaching(schedule,new Trainer("Sujesh", 494949,"Spring")));
		thread[2] = new Thread(new Teaching(schedule,new Trainer("Rakesh", 494949,"Angular")));
			
		  
	      for (int i = 0; i < 3; i++)
	      {
	         thread[i].start();
	      }

	}
	
}
