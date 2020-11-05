package com.training.locks;

public class Teaching implements Runnable {

	private ScheduleTraining schedule;
	
	private Trainer trainer;
	
	public Teaching(ScheduleTraining schedule,Trainer trainer) {
		super();
		this.schedule = schedule;
		this.trainer = trainer;
	}


	@Override
	public void run() {
	      System.out.println("Starting :"+ trainer.getTopic() );
	      schedule.printJob(trainer);

	}

}
