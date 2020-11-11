package com.training.demo.calculator;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {	
    	Logger log = Logger.getRootLogger();
    	
    	Calculator calc = new Calculator();

		System.out.println("Values: " + calc.calculate("45", "50"));

        System.out.println( "Hello World!" );
        
        Author author = new Author("Sathish", "Reddy", "sat@rad.com");
        
        Book headFirst = new Book(69, "Head First Java", author, 420.99);
        
        Gson gson = new Gson();
        
        String jsonFormat = gson.toJson(headFirst);
        
        log.info(jsonFormat);
    }
}
