package com.example.map.demo;

import java.io.*;
import java.util.Properties;

public class ReadResource {

	public void readFile(String fileName) {
		
		   InputStream inputStream =null;

		try {

		   ClassLoader classLoader = getClass().getClassLoader();
		   
		   File configFile=new File(classLoader.getResource(fileName).getFile());
		  
		    inputStream = new FileInputStream(configFile);
		   
		   Properties props = new Properties();
		   
		   props.load(inputStream);
		   
		   System.out.println(props.get("db.userName"));
		   System.out.println(props.get("db.passWord"));
		   System.out.println(props.get("db.url"));
          System.out.println(props.get("db.driverClass"));
		    
	} catch (Exception e) {
          e.printStackTrace();
	}finally {
		 try {
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}
	public static void main(String[] args) {

		
		ReadResource reader =new ReadResource();
		
		 reader.readFile("DataSource.properties");
		
		
	}
}
