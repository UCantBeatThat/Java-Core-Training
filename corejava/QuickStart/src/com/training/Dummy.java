package com.training;
import java.io.File;
import java.util.*;


public class Dummy {

	public static void main(String[] args) {

		List<Long> ids = new ArrayList<>(); 
		ids.add(123L);
		ids.add(999L);
		Map<String,Long> students = new HashMap<>(); 
		students.put("Jess",ids.get(0));
		students.put("Jimmy",ids.get(1));
		int x = students.get("Jimmy").intValue(); 

System.out.println(x);

	}

}
