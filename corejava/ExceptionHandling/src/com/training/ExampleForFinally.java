package com.training;

//Number Format Exception
// Null Pointer Exception

public class ExampleForFinally {

	
	private static String name;
	
	public static double celToFaren(double celsius) {
		
		return (9/5*(celsius))+32;
		
	
	}
	
	public static double findLength(String name) {
	
		return name.length();
	}
	
	
	public static void main(String[] args) {

		
		try {
	
			double faren =	Double.parseDouble(args[0]);
			  
			System.out.println(celToFaren(faren));
			
			System.out.println(findLength(args[1]));

			
		} catch (NumberFormatException e) {
			
			 e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.err.println(e.getClass());
			System.err.println("Command Line argument not passed - use Run Configuration");
		}
		catch(NullPointerException e) {
			
			System.err.println("Check name is assigned with a value or not ");
			
		   	
		}
		
		finally {
			
			System.out.println("Inside finally");
		}
		
		System.out.println("Bye");
	}

}
