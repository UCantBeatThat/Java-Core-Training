package com.training.locks;


public class Trainer  {

	private String trainerName;
	private long mobileNumber;
	private String topic;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Trainer(String trainerName, long mobileNumber, String topic) {
		super();
		this.trainerName = trainerName;
		this.mobileNumber = mobileNumber;
		this.topic = topic;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(String trainerName, long mobileNumber) {
		super();
		this.trainerName = trainerName;
		this.mobileNumber = mobileNumber;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
		
}
