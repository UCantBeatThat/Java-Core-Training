package com.training.demo;

import com.training.demo.model.Student;
import com.training.demo.utils.AnnotationProcessor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationProcessor.handleDataTable(new Student());

	}

}
