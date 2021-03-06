package com.training;

import java.io.IOException;

public class UsingJoinMethod {
	public static void main(String[] args) {
		
		System.out.println("Main Starting");
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Reading");
				
				try {
					System.in.read();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("Finished Reading");
			}
		};
		
		t1.start();
		
		try {
			t1.join();
		}
		catch(InterruptedException ee) {
			ee.printStackTrace();
		}
		
		System.out.println("Main Finished");
	}
}
