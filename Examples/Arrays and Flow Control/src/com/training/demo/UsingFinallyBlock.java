package com.training.demo;

public class UsingFinallyBlock {
	
	public static String getMessage(String name) {
		
		int length = 0;
		try {
			length = name.length();
		}
		catch(NullPointerException nle) {
			System.err.println("ERR-420: getMessage(String) Arguement may be null");
			return "String Length (though null): " + length;
		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("After Catch");
		
		return "String Length: " + length;
	}
}
