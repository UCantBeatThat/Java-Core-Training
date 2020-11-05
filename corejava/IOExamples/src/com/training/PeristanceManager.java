package com.training;

import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class PeristanceManager {


	public boolean save(Book book) {
	
		 boolean status = false;
		
		ObjectOutputStream outStream = null;
				
		try {
					
			outStream = 
						 new ObjectOutputStream(new FileOutputStream(new File("books.ser")));
		
			      outStream.writeObject(book);
			status = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				outStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
	
	
	public Book load() {
		
		ObjectInputStream inStream = null;
		Book book = null;
		
		try {
			
			inStream = new ObjectInputStream(new FileInputStream(new File("books.ser")));
			
			book = (Book) inStream.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return book;
	}
	
	
}
