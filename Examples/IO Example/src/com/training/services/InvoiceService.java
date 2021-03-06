package com.training.services;

import java.io.*;
import com.training.model.*;

public class InvoiceService {
	
	private File file;

	public InvoiceService(File file) {
		super();
		this.file = file;
	}
	
	public boolean writeToFile(Invoice entity) {
		boolean result = false;
		
		try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(this.file))) 
		{
			outStream.writeObject(entity);
			result = true;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Invoice readFromFile() {
		Invoice object = null;
		
		try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(this.file))){
			object = (Invoice)inStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return object;
	}
	
	public boolean writeToTextFile(Invoice entity) {
		boolean result = false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(this.file, true))){
			writer.println(entity);
			result = true;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Invoice[] readFromTextFile() {
		
		Invoice[] list = new Invoice[10];
		
		try(BufferedReader reader = new BufferedReader(new FileReader(this.file))){
			String line = "";
			int listIndex = 0;
			while((line = reader.readLine()) != null) {
				String[] invoiceFields = line.split(",");
				
				list[listIndex++] = new Invoice(Integer.parseInt(invoiceFields[0]), invoiceFields[1], Double.parseDouble(invoiceFields[2]));
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
