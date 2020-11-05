package com.training;

import java.io.*;

public class ManageAuthors {

	
	public boolean write(Author author) {
		
		boolean status = false;
		
		PrintWriter writer =null;
		
		try {
			
			// writer = new PrintWriter(new File("Author.txt"));
			
			// Decorating with Filewriter Provides a additional feature ( i.e ) append 
			
			writer = new PrintWriter(new FileWriter(new File("Author.txt"),true));
			
			writer.println(author.toString());
			
			status = true;
			
		} catch (Exception e) {
			
              e.printStackTrace(System.err);
		}
		finally {
			
			writer.close();
		}
		return status;
	}
	
	
	public Author read()  {
		
		Author author =null;
		
		BufferedReader reader =null;
		
		try {
			
			reader = new BufferedReader(new FileReader(new File("Author.txt")));
			
			String line = null;
			
			while((line=reader.readLine())!=null) {
				
			 String[] values =	line.split(",");
			 
			 author = new Author(Long.parseLong(values[0]), values[1],
					                      Long.parseLong(values[2]), values[3]);
			 
			}
			
			
		} catch (Exception e) {
             e.printStackTrace(System.err);
		}
		finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return author;
	}
}
