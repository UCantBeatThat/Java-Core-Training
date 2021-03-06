package com.training.exceptionstore;

public class MyCustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyCustomException() {
		super();
	}

	public MyCustomException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Custom Exception: " + super.getMessage();
	}
	
	
}
