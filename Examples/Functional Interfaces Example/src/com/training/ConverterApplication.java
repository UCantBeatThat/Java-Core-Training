package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.Converter;
import com.training.services.FunctionalJava;

public class ConverterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalJava func = new FunctionalJava();
		
		Converter<Double, Double> conv1 = val -> val*75;
		double resp = func.useConverter(conv1, 10);
		
		System.out.println(resp);
		
		resp = func.useConverter(far-> (far-32)*5/9, -40);
		
		System.out.println(resp);
		
		List<String> list = Arrays.asList("Ramesh", "Suresh", "Mangesh", "Sundar", "Sukesh", "Shiva");
		
		// list.forEach(e -> System.out.println(e));
		list.forEach(System.out::println);
		list.forEach(FunctionalJava::show);
		
		System.out.println("------------------");
		
		Predicate<String> testForSH = arg -> arg.contains("sh");
		
		for(String eachString : list) {
			if(testForSH.test(eachString)) {
				System.out.println(eachString);
			}
		}

	}

}
