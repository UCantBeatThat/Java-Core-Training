package com.project.organicstores.daily_sales_report.utils;

import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.*;


public class ConnectionUtils {
	
	public static String[] getPropsAsArray() {
		
		String url = "";
		String userName = "";
		String password = "";
		
		try {
			
			String propertiesFile = "DBConnection.properties";
			
			InputStream stream = ConnectionUtils.class.getClassLoader().getResourceAsStream(propertiesFile);
			
			Properties props = new Properties();
			
			props.load(stream);
			
			url = props.getProperty("database.url");
			userName = props.getProperty("database.username");
			password = props.getProperty("database.password");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return new String[] {url, userName, password};
	}
	
	public static Connection getMySqlConection() {
		
		Connection con = null;
		
		try {
			
			String[] values = getPropsAsArray();
			
			con = DriverManager.getConnection(values[0], values[1], values[2]);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static Connection getConnectionFromPool() {
		
		Connection con = null;
		
		try{
			HikariConfig config = new HikariConfig();
			
			String[] values = getPropsAsArray();
			
			config.setJdbcUrl(values[0]);
			config.setUsername(values[1]);
			config.setPassword(values[2]);
			config.addDataSourceProperty("maximumPoolSize", 25);
			
			DataSource dataSource = new HikariDataSource(config);
			
			con = dataSource.getConnection();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}