package com.training;

import com.training.models.BankAccount;

public class ThreadCommunication {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				System.out.println();
				System.out.println("Amount Withdrawn " + account.withdraw(6000));
			}
		};
		
		Thread t2 = new Thread() {
			
			@Override
			public void run() {
				System.out.println();
				System.out.println("Amount Deposited " + account.deposit(1000));
			}
		};
		
		Thread t3 = new Thread() {
			
			@Override
			public void run() {
				System.out.println();
				System.out.println("Amount Deposited " + account.deposit(10000));
			}
		};
		
		t1.start();
		
		t2.start();
		
		try {
			Thread.sleep(2000);
			t3.start();
			t1.join();
		}
		catch(InterruptedException ee) {
			ee.printStackTrace();
		}
		
		
		
		System.out.println("Bal:" + account.getBalance());
	}
}
