package com.training.utils;

import java.sql.*;
import java.util.Properties;
import java.io.*;


public class ConnectionUtils {
	
	public static Connection getMySqlConection() {
		
		Connection con = null;
		
		try {
			
			String propertiesFile = "resources/DBConnection.properties";
			
			InputStream stream = ConnectionUtils.class.getClassLoader().getResourceAsStream(propertiesFile);
			
			Properties props = new Properties();
			
			props.load(stream);
			
			String url = props.getProperty("database.url");
			String userName = props.getProperty("database.username");
			String password = props.getProperty("database.password");
			
			con = DriverManager.getConnection(url, userName, password);
			
			System.out.println(stream);
		}
		catch(IOException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getMySqlConection());
	}

}
