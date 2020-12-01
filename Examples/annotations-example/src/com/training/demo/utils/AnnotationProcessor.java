package com.training.demo.utils;

import com.training.demo.annotations.DataTable;

public class AnnotationProcessor {

	public static void handleDataTable(Object objStudent) {
		
		Class<?> instanceClass = objStudent.getClass();
			
		DataTable annotation = (DataTable)instanceClass.getAnnotation(DataTable.class);
			
		System.out.println(annotation);
		String tableName = annotation.tableName();
			
		System.out.println(tableName);
			
		String sqlString = "INSERT INTO " + tableName + " VALUES (?, ?)";
			
		System.out.println(sqlString);
	}
}
