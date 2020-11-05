package com.training.list.demo;

import java.util.*;

import com.training.domains.Author;
public class GenericApplication {

	public static void main(String[] args) {

		GenericManager<Author> authorMgr = new GenericManager<>();
		
		authorMgr.add(new Author(102,"Shyam",684848,"shy@ab.com"));
		authorMgr.add(new Author(103,"Siva",584848,"siva@ab.com"));
	
		System.out.println(authorMgr.getDataList());
		
		GenericManager<String> stringMgr= new GenericManager<>();
		
		stringMgr.add("Ramesh");
		stringMgr.add("Suresh");
		stringMgr.add("Ganesh");
		System.out.println(stringMgr.getDataList());
		
		GenericManager<Integer> intMgr = new GenericManager<>();
		
		intMgr.add(45);
		intMgr.add(95);
		intMgr.add(65);
		
		System.out.println(intMgr.getDataList());
	}

}
