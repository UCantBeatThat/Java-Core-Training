package com.trainig.domains;

import java.util.Scanner;

import com.trainig.ifaces.Billable;

public class Application {

	public static void main(String[] args) {

		
		
		ServiceProvider provider = new ServiceProvider();
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("y")) {
		
			System.out.println("1 - Advocate 2 - Cook ");
			int option = sc.nextInt();
			Billable  obj = provider.occupationFactory(option);
			
			System.out.println(provider.findWage(obj));
			
			System.out.println("y to continue to n to stop");
			
			choice = sc.next();
		}
		System.out.println("Bye .......");
		sc.close();
		
		
		
	}

}
